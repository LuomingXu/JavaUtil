import Annotation.ListSortDefault;
import Model.PageRequest;
import Model.Sort;
import Model.testModel;
import Util.ListPageHelperUtil;
import Util.SortUtil;
import Exception.SortException;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class Main
{
    public static void main(String[] args)
    {
        Random rd = new Random(1000);
        List<testModel> testModels = new ArrayList<>();
        testModel temp;

        Date date = new Date();
        System.err.println(date.getClass().getName());
        System.err.println("now : "+new Date(System.currentTimeMillis()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 20; i++)
        {
            temp = new testModel();
            temp.setDoubleTemp(rd.nextDouble());
            temp.setIntTemp(rd.nextInt());
            temp.setLongTemp(rd.nextLong());
            temp.setDateTemp(new Date(System.currentTimeMillis() + rd.nextInt()));
            temp.setTestModelTemp(new testModel());
            testModels.add(temp);
        }

        System.err.println("-------------normal-------------");
//        for (Object item : testModels)
//        {
//            System.out.println(item);
//        }
//        try
//        {
//            SortUtil.doSort(new Sort("testModelTemp", Sort.Direction.DESC), testModels);
//        }
//        catch (SortException e)
//        {
//            e.printStackTrace();
//        }
//        System.err.println("-------------sorted-------------");
//        for (Object item : testModels)
//        {
//            System.out.println(item);
//        }
    }
}