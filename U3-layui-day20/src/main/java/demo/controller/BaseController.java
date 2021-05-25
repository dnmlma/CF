package demo.controller;

import demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

public class BaseController<T> {
    @Autowired
    private BaseService<T> baseService;

    /**
     * �첽�����������
     * @param page  ��ǰҳ��
     * @param limit ÿҳ����
     * @return  layui����Ҫ�ķ�װ������
     */
    @RequestMapping("loadData")
    @ResponseBody  //ֻ��������JSON��ʽ
    public Map<String,Object> loadData(Integer page, Integer limit){
        System.out.println("page = " + page);
        System.out.println("limit = " + limit);
        Map<String,Object> map = null;
        try{
            //��ҳ��ѯ����
            map = baseService.findTByPage(page, limit);
            map.put("code", 0); //����״̬�룺0 ��ʾ���󷵻سɹ�
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 200); //����״̬�룺200 ��ʾ���󷵻�ʧ��
            map.put("msg","���ݷ���ʧ�ܣ�");
        }
        return map;
    }


    /**
     * ͨ����ѯ������ҳ��ѯ����
     * @param page ��ǰҳ��
     * @param limit ÿҳ����
     * @param t ��װ�˲�ѯ����
     * @return
     * */

    @RequestMapping("loadDataByParams")
    @ResponseBody  //ֻ��������JSON��ʽ
    public Map<String,Object> loadDataByParams(Integer page, Integer limit, T t){
        System.out.println("page = " + page);
        System.out.println("limit = " + limit);
        Map<String,Object> map = null;
        try{
            //��ҳ��ѯ����
            map = baseService.findTByPageAndParams(page, limit, t);
            map.put("code", 0); //����״̬�룺0 ��ʾ���󷵻سɹ�
        }catch (Exception e){
            e.printStackTrace();
            map.put("code", 200); //����״̬�룺200 ��ʾ���󷵻�ʧ��
            map.put("msg","���ݷ���ʧ�ܣ�");
        }
        return map;
    }

    //��������idɾ����������
    @RequestMapping("delTById")
    @ResponseBody
    public String delTById(Integer id){
        try{
            return baseService.removeTById(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    //���ݶ������Idɾ������
    @RequestMapping("delBatchTByIds")
    @ResponseBody
    public String delBatchTByIds(Integer[] ids){
        try{
            return baseService.removeBatchTByIds(ids);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    //��ӵ�������
    @RequestMapping("saveT")
    @ResponseBody
    public String saveT(T t){
        try{
            return baseService.saveT(t);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    //��̬�޸�����
    @RequestMapping("updT")
    @ResponseBody
    public String updT(T t){
        try{
            return baseService.modifyT(t);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    //�첽���������������
    @RequestMapping("loadAllT")
    @ResponseBody
    public List<T> loadAllT(){
        try{
            return baseService.findTAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
