package oit.is.z0493.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lec02Controller {

  @GetMapping("/sample")
  public String sample(){
    return "lec02.html";
  }
   /**
   *
   * @param name
   * @param model
   * @return
   *
   */
  @PostMapping("/nameform")
  public String Lec02
  (@RequestParam String name, ModelMap model) {
    String yourname=name;
    model.addAttribute("yourname",yourname);
    return "lec02.html";
  }
  /**
   *
   * @param param1
   * @param model
   * @return
   *
   */
  @GetMapping("/lec02/{param1}")
  public String janken(@PathVariable String param1,ModelMap model){
    String judge=""; //ememyはずっとグー
    String enemy="Gu";
    String me;
    if(param1.equals("gu")){
      me="Gu";
      judge="Draw";
    }else if(param1.equals("tyo")){
      me="Tyoki";
      judge="You Lose";
    }else if(param1.equals("pa")){
      me="Pa";
      judge="You Win";
    }else{
      me="";
      judge="";
    }
    model.addAttribute("judge",judge);
    model.addAttribute("enemy",enemy);
    model.addAttribute("me",me);
    return "lec02.html";
  }
}
