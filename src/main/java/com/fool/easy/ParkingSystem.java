package com.fool.easy;

/**
 * 1603. ���ͣ��ϵͳ
 * �����һ��ͣ�������һ��ͣ��ϵͳ��ͣ�����ܹ������ֲ�ͬ��С�ĳ�λ�����к�С��ÿ�ֳߴ�ֱ��й̶���Ŀ�ĳ�λ��
 *
 * ����ʵ�� ParkingSystem�ࣺ
 *
 * ParkingSystem(int big, int medium, int small)��ʼ��ParkingSystem�࣬���������ֱ��Ӧÿ��ͣ��λ����Ŀ��
 * bool addCar(int carType)����Ƿ���carType��Ӧ��ͣ��λ��carType���������ͣ����У�С���ֱ�������1��2��3��ʾ��һ����ֻ��ͣ��carType��Ӧ�ߴ��ͣ��λ�С����û�пճ�λ���뷵��false�����򽫸ó�ͣ�복λ������true��
 * 
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/design-parking-system
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 *
 * @author Qiq
 * @date 2021/5/23
 */
public class ParkingSystem {

    private Integer big;
    private Integer medium;
    private Integer small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                return this.big-- > 0;
            case 2:
                return this.medium-- > 0;
            case 3:
                return this.small-- > 0;
            default:
                return false;

        }
    }

    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1,1,0);
        ps.addCar(1);
        ps.addCar(1);
        ps.addCar(1);
    }

}
