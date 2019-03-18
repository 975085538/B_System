package cn.jbit.guide_sys;

import cn.jbit.guide_sys.mapper.AdminMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("cn.jbit.guide_sys.mapper")
@SpringBootApplication
public class GuideSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuideSysApplication.class, args);
    }

}
