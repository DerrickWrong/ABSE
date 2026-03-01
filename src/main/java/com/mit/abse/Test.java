package com.mit.abse;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

import com.nomagic.magicdraw.plugins.Plugin;

import jakarta.annotation.PostConstruct;



@Component
public class Test extends Plugin{

	@PostConstruct
	void initBean() {
		System.out.println("Bean init Here");
	}
	
	@Override
	public void init() {
		System.out.println("Test Here");
		JOptionPane.showMessageDialog(null, "My Plugin init with spring");
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog( null, "My Plugin close with Spring"); 
		return true;
	}

	@Override
	public boolean isSupported() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
