package com.example.Controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AttendanceController{
	
	@GetMapping("/AttendanceEngraving")
	public String getHello() {
		
		//Calendarクラスで月・日・現在時刻の取得
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.getTime());
		//AttendanceEngraving.htmlに画面遷移
		return "/attendance/AttendanceEngraving";
	}
	
	@GetMapping("/AttendanceList")
	public String list() {
		return "attendance/AttendanceList";
	}
	
	@GetMapping("/AttendanceCorrection")
	public String correction() {
		return "attendance/AttendanceCorrection";
	}
	
}