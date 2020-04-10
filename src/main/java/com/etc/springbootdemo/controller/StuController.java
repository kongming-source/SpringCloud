package com.etc.springbootdemo.controller;


import com.etc.springbootdemo.entity.Stu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StuController {

    private static Logger logger = LoggerFactory.getLogger(StuController.class);

    private static List<Stu> list = new ArrayList<>();
    static {
        Stu s = new Stu(10,"张三","男");
        Stu s2 = new Stu(20,"李四","女");
        Stu s3 = new Stu(30,"王五","男");
        list.add(s);list.add(s2);list.add(s3);
    }

    @RequestMapping("/stutoadd")
    public ModelAndView toadd(){
        ModelAndView mv = new ModelAndView("stuadd");
        return mv;
    }

    @RequestMapping("/stuget/{sid}")
    public ModelAndView get(@PathVariable int sid){
        ModelAndView mv = new ModelAndView("stuget");
        for(Stu s:list){
            if(s.getSid().equals(sid)){
                mv.addObject("s",s);
                break;
            }
        }
        return mv;
    }


    @RequestMapping("/stuadd")
    public ModelAndView add(Stu s){
        ModelAndView mv = new ModelAndView("redirect:stuquery");
        list.add(s);
        return mv;
    }

    @RequestMapping("/studel/{sid}")
    public ModelAndView del(@PathVariable Integer sid){
        ModelAndView mv = new ModelAndView("redirect:../stuquery");
        for(int i=0;i<list.size();i++){
            if(list.get(i).getSid().equals(sid)){
                list.remove(i);
                break;
            }
        }

        return mv;
    }

    @RequestMapping("/stuquery")
    public ModelAndView query(){
        logger.info("com here stuquery method");
        ModelAndView mv = new ModelAndView("stuquery");
        mv.addObject("list",list);
        return mv;
    }
}
