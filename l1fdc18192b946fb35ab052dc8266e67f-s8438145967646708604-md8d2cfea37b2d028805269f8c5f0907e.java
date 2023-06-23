package IODome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDome01 {
	public static  void main(String[]args) throws IOException {
		//������Ƚ�������
		//1.�����ļ������������ļ����뵽����
		//2.�����ļ������������ȡ�����ļ�����д�뵽ָ��λ��
		String filepath = "e:\\beijita.jpg";
		String destfilepath ="d:\\beijita01.jpg";
		FileInputStream fi = null;
		FileOutputStream ou = null;
		
		try {
			fi = new FileInputStream(filepath);
			ou = new FileOutputStream(destfilepath);
			//����һ���ֽ����� ���Ч��
			byte[] buf = new byte[1024];
			int readLen = 0;
			while((readLen = fi.read(buf))!=-1){
				//��ȡ�����д�뵽�ļ���,�߶���д
				ou.write(buf , 0 ,readLen); //����ʹ�����������
				
			}
			System.out.println("�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fi != null) {
				fi.close();
			}
			if(ou != null) {
				ou.close();
			}
					
		}
		
	}
	
}
