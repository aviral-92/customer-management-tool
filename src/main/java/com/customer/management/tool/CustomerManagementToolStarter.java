/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customer.management.tool;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.customer.management.tool.cache.CacheManager;
import com.customer.management.tool.ui.LoginForm;

/**
 *
 * @author Aviral
 */

@SpringBootApplication
@PropertySource("classpath:/application.properties")
public class CustomerManagementToolStarter extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {

		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
				.getInstalledLookAndFeels()) {
			if ("Windows".equals(info.getName())) {
				try {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
		ConfigurableApplicationContext context = new SpringApplicationBuilder(
				CustomerManagementToolStarter.class).headless(false).run(args);
		context.getBean(LoginForm.class).setVisible(true);
		context.getBean(LoginForm.class).setResizable(false);
		context.getBean(CacheManager.class).insertInCategoryMap();
	}
}
