package ivy.mybatis.mybatisspringboot;

import ivy.mybatis.mybatisspringboot.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringBootApplication.class, args);
    }

}
