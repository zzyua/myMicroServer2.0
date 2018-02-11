package com.zyu.demos.algorithms;


import java.util.*;

/**
 * 轮询算法 Round-Robin
 * 1、RoundRobin  轮询法
 * 2、weightRoundRobin 加权轮询法
 * 3、Random  随机负载均衡算法
 * 4、WeightRandom 加权随机负载均衡算法
 */
public class Round_Robin {

    volatile private static Integer pos = 0;


    static Map<String, Integer> serverWeigthMap = new HashMap<String, Integer>();


    static {
        serverWeigthMap.put("192.168.1.12", 1);
        serverWeigthMap.put("192.168.1.13", 1);
        serverWeigthMap.put("192.168.1.14", 2);
        serverWeigthMap.put("192.168.1.15", 2);
        serverWeigthMap.put("192.168.1.16", 3);
        serverWeigthMap.put("192.168.1.17", 3);
        serverWeigthMap.put("192.168.1.18", 1);
        serverWeigthMap.put("192.168.1.19", 2);
    }




    /**
     * RoundRobin  轮询法
     *
     * @return serverIp
     */
    public static String roundRobin() {
        //重新建立一个map,避免出现由于服务器上线和下线导致的并发问题
        Map<String, Integer> serverMap = new HashMap<String, Integer>();
        serverMap.putAll(serverWeigthMap);
        //1、获取list方式一
//      List list<String> = new ArrayList(serverMap.keySet());

        //2、获取list方式二
        List<String> list = new ArrayList();
        list.addAll(serverWeigthMap.keySet());

        String server = null;
        if (pos >= list.size()) {
            pos = 0;
        }
        server = list.get(pos);
        pos++;
        return server;
    }

    /**
     * WeightRandom 加权负载均衡算法
     *
     * @return serverIp
     */
    public static String weightRoundRobin() {
        Map<String, Integer> serverMap = new HashMap<String, Integer>();
        serverMap.putAll(serverWeigthMap);
        //keyIterator 作为key的迭代器
        Iterator<String> keyIterator = serverMap.keySet().iterator();
        List<String> serverList = new ArrayList<>();

        //使用lambda迭代Iterator
        keyIterator.forEachRemaining(server -> {
            // System.out.println(server);
            Integer weight = serverMap.get(server);
            for (Integer i = 0; i < weight; i++) {
                serverList.add(server);
            }
        });
        String server = null;
        if (pos >= serverList.size()) {
            pos = 0;
        }
        server = serverList.get(pos);
        pos++;
        return server;
    }


    /**
     * 随机负载均衡算法
     *
     * @return serverIp
     */
    public static  String RandomRoundRobin(){
        //重新建立一个map,避免出现由于服务器上线和下线导致的并发问题
        Map<String, Integer> serverMap = new HashMap<String, Integer>();
        serverMap.putAll(serverWeigthMap);

        List<String> list = new ArrayList();
        list.addAll(serverWeigthMap.keySet());

        Random random = new Random();
        Integer pos  =  random.nextInt(list.size());
        return  list.get(pos);
    }

    /**
     * WeightRandom 加权随机负载均衡算法
     *
     * @return
     */
    public  static  String WeightRandom(){
        Map<String, Integer> serverMap = new HashMap<String, Integer>();
        serverMap.putAll(serverWeigthMap);
        //keyIterator 作为key的迭代器
        Iterator<String> keyIterator = serverMap.keySet().iterator();
        List<String> serverList = new ArrayList<>();

        //使用lambda迭代Iterator
        keyIterator.forEachRemaining(server -> {
            // System.out.println(server);
            Integer weight = serverMap.get(server);
            for (Integer i = 0; i < weight; i++) {
                serverList.add(server);
            }
        });

        Random random =  new Random();
        Integer pos =  random.nextInt(serverList.size());

        return serverList.get(pos);

    }



    public static String IpHash(String remoteIp){
//        Map<String , Integer> serverMap = new HashMap<>();
//        serverMap.putAll(serverWeigthMap);
//
//        Set<String> serverSet =  serverMap.keySet();
//        ArrayList<String > keyList = new ArrayList<>();
//        keyList.addAll(serverSet);
//
//        int hashCode =remoteIp.hashCode();
//        int serverListSize = keyList.size();
//        int serverPos = hashCode % serverListSize;
//
//        System.out.println("hashCode= "+ hashCode+  " ;  serverPos=" + serverPos + " ; keyListSize=" + keyList.size());
//
//        return keyList.get(serverPos);


        return "";

    }





    public static void main(String[] args) {


        //1.测试  轮询法
//        while (true) {
//            System.out.println("轮询法--当前服务器：" + Round_Robin.roundRobin());
//        }


        //2、4.测试   加权轮询法
//        int ip12s = 0 ;
//        int ip16s = 0 ;
//        for (int i = 0; i < 100; i++) {
//            String ip = Round_Robin.weightRoundRobin() ;
//            if("192.168.1.12".equalsIgnoreCase(ip)){
//                ip12s ++ ;
//            }else if("192.168.1.16".equalsIgnoreCase(ip)) {
//                ip16s++ ;
//            }
//
//        }
//        System.out.println("192.168.1.12的数量是:" + ip12s);
//        System.out.println("192.168.1.16的数量是:" + ip16s);

        //3.测试  随机轮询法
//        for (int i = 0; i < 20; i++) {
//            System.out.println("轮询法--当前服务器：" + Round_Robin.RandomRoundRobin());
//        }


//        System.out.println(Round_Robin.IpHash("172.10.10.36"));


    }


}
