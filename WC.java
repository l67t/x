import java.util.Scanner;

public class WC {

    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("ָ��˵����");
        System.out.println("wc.exe -c  //�����ļ����ַ���");
        System.out.println("wc.exe -w  //�����ļ��ĵ�����");
        System.out.println("wc.exe -l  //�����ļ�������");
        System.out.println("wc.exe -a  //�����ļ��Ŀ�����������������ע������");
        System.out.println("*********************************************");    
        Scanner scan=new Scanner(System.in);
        String order=null;
        while((order=scan.nextLine())!="") {
        switch(order) {
        case "wc.exe -c":System.out.println("�������ļ�·��:");
                         new Codecount();break;
        case "wc.exe -w":System.out.println("�������ļ�·��:");
                         new Wordcount();break;
        case "wc.exe -l":System.out.println("�������ļ�·��:");
                         new Linecount();break;
        case "wc.exe -a":System.out.println("�������ļ�·��:");
                          new Extra();break;                
        default:System.out.println("ָ�������������������ָ��:");
        }
        
    }
        scan.close();
        
}}