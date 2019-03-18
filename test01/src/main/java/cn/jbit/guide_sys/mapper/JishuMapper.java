package cn.jbit.guide_sys.mapper;

import cn.jbit.guide_sys.pojo.Jishu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JishuMapper {
    //查询技术
    List<Jishu> selJishu(@Param("id") int id);
    //添加技术
    int addJishu(Jishu jishu);
    //模糊查询
    List<Jishu> selmohu(@Param("name") String name);
}
