package ivy.mybatis.mybatisspringboot.mapper;

import ivy.mybatis.mybatisspringboot.model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {
    List<Country> selectAll();
}
