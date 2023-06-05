package com.example.Controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LeavingWorkController{
	
	@GetMapping("/engraving")
	public String getHello() {
		
		//Calendarクラスで月・日・現在時刻の取得
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.getTime());
		//hello.htmlに画面遷移
		return "leavingWork/leavingWork";
	}
	
}