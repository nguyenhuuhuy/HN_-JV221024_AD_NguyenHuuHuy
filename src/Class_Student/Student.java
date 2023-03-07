package Class_Student;

import java.util.Scanner;


public class Student extends ClassStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassStudent[] listStudent = new ClassStudent[200];
        int size = 0, choise;
        boolean cont = true;
        do {
            System.out.println("1. Nhập số sinh viên và nhập thông tin cho các sinh viên");
            System.out.println("2. In thông tin các sinh viên đang quản lý");
            System.out.println("3. Sắp xếp các sinh viên theo điểm trung bình tăng dần");
            System.out.println("4. Nhập vào tên sinh viên và tìm kiếm sinh viên theo tên");
            System.out.println("5. Thống kê số sinh viên nam, nữ đang quản lý ");
            System.out.println("6. In ra thông tin các sinh viên xếp loại giỏi và trung bình");
            System.out.println("7. Thoát.");
            System.out.print("Vui lòng chọn số: ");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    do {
                        System.out.println("Nhập số sinh viên: ");
                        size = sc.nextInt();
                        if (size > 200)
                            System.out.println("Số sv phải nhỏ hơn 200 người!");
                    } while (size > 200);
                    for (int i = 0; i < size; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1) + " : ");
                        listStudent[i] = new ClassStudent();
                        listStudent[i].inputData();
                    }
                    break;
                case 2:
                    System.out.println("Các sinh viên trong lớp: ");
                    for (int i = 0; i < size; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1) + " : ");
                        listStudent[i].displayData();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Đã thoát!");
                    cont = false;
            }
        } while (cont);
    }
}
