package cn.jbit.guide_sys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {

    Integer loadByUsername(@Param("a_name") String a_name,@Param("a_pass") String a_pass);

}
