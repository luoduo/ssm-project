package cn.ld.pagehelper;

import cn.ld.mapper.TbItemMapper;
import cn.ld.pojo.TbItem;
import cn.ld.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPageHelper {

    public static void main(String[] args) {
        //设置分页信息
        PageHelper.startPage(1,10);
        //执行查询
        //初始化一个spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        //从spring容器中获取mapper代理对象
        TbItemMapper itemMapper = context.getBean(TbItemMapper.class);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        //取分页结果
        PageInfo<TbItem> page= new PageInfo<TbItem>(list);
        System.out.println("查询结果总记录数："+page.getTotal());
        System.out.println("查询结果总页数："+page.getPages());
        System.out.println("当前页："+page.getPageNum());
        System.out.println("list size ："+list.size());
    }
//    public void testPageHelper() throws Exception{
//
//    }
}
