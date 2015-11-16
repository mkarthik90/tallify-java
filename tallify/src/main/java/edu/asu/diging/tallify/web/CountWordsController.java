package edu.asu.diging.tallify.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.asu.diging.tallify.model.CountWordsBean;
import edu.asu.diging.tallify.service.ICountWordService;

@Controller
public class CountWordsController {

    @Autowired
    public ICountWordService countWordService;

    @RequestMapping(value = "/getCountWordsPage", method = RequestMethod.GET)
    public ModelAndView getPage(@ModelAttribute("countWordsBean") CountWordsBean countWordsBean) {
        ModelAndView model = new ModelAndView("/countWords");
        model.addObject("errors",false);
        return model;
    }

    @RequestMapping(value = "/countWords", method = RequestMethod.POST)
    public ModelAndView getCount(@ModelAttribute("countWordsBean") CountWordsBean countWordsBean) {

        if(countWordsBean.getTextValue().trim().equalsIgnoreCase("")){
            ModelAndView model = new ModelAndView("/countWords");
            model.addObject("errors",true);
            return model;
        }
        Map<String, Integer> result = countWordService.calculateCount(countWordsBean.getTextValue(),countWordsBean.getStopWords());
        countWordsBean.setListOfWords(result);
        ModelAndView model = new ModelAndView("/result");
        model.addObject("listOfWords", result);
        model.addObject("test", "test");
        model.addObject("countWordsBean",countWordsBean);
        return model;
    }
}
