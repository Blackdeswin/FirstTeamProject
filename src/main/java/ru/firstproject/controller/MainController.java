package ru.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.firstproject.model.Article;
import ru.firstproject.service.ArticleService;

import java.util.List;

//import ru.firstproject.dao.impls.SQLiteDAO;


@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private ArticleService service;
    //private SQLiteDAO sqLiteDAO;

    @RequestMapping
    public List<Article> mainPage(Model model) {
      //  model.addAttribute("articles", sqLiteDAO.getArticleById());
     //   model.addAttribute("articles", service.getAll());
        model.addAttribute("articles");
        return service.getAll();
        //return "main";
    }




    @RequestMapping(value = "/admin")
    public String adminPage(Model model) {
        model.addAttribute("article", new Article());//Добовляе в модель новый объект Article, у котрого поля пустые
        return "admin"; // Отображет страницу с названием admin
    }

    @RequestMapping(value = "/admin/submit", method = RequestMethod.POST)
    public String submitArticle(@ModelAttribute Article article) {// Получает данные со страницы и сохраняет в бд
         service.save(article);
   //     sqLiteDAO.submit(article);
        return "redirect:../";
    }

    @RequestMapping(value = "/admin/submit2", method = RequestMethod.POST)
    public String deleteArticle(@ModelAttribute Article article) {// Получает данные со страницы и удляет все из бд
        service.deleteAll(article);
        return "redirect:../";
    }
    @RequestMapping(value = "/login")
    public String loginPage() {
        return "login";
    }
}
