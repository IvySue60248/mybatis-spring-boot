package ivy.mybatis.mybatisspringboot.controller;

import ivy.mybatis.mybatisspringboot.mapper.CountryMapper;
import ivy.mybatis.mybatisspringboot.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private CountryMapper countryMapper;

    @RequestMapping("/")
    String home() {
        return "Hello World";
    }

    @RequestMapping("/country")
    List<Country> country() {
        return countryMapper.selectAll();
    }
}
