package com.alethio.shop.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ItemNotFoundException.class)
	public ModelAndView ItemNotFoundException(Exception exception) {
		ModelAndView mav = new ModelAndView("error/alert");
		mav.addObject("message", exception.getMessage());
		
		return mav;
	}

	@ExceptionHandler(ItemNotEnoughException.class)
	public ModelAndView ItemNotEnoughException(Exception exception) {
		ModelAndView mav = new ModelAndView("error/alert");
		mav.addObject("message", exception.getMessage());
		
		return mav;
	}

}
