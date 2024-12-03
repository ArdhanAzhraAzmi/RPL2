/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.ardhan;

import me.ardhan.controller.MahasiswaController;
import me.ardhan.service.MahasiswaService;
import me.ardhan.view.MahasiswaView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


/**
 *
 * @author Ardhan
 */
@SpringBootApplication
public class Pertemuan6_50421187 implements ApplicationRunner {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(Pertemuan6_50421187.class, args);
        
        MahasiswaController controller = context.getBean(MahasiswaController.class);
        MahasiswaView mahasiswaView= new MahasiswaView(controller);
        mahasiswaView.setVisible(true);
        
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        
    }
}
