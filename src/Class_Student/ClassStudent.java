package Class_Student;

import java.time.Year;
import java.util.Scanner;

public class ClassStudent {
    private String studentId;
    private String studentName;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private float html;
    private float css;
    private float javascript;
    private float avgMark;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public float getJavascript() {
        return javascript;
    }

    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        // mã sv
        boolean checkStudenId = true;
        boolean checkPhone = true;
        do {
            System.out.print("Nhập mã sv (Bắt buộc phải có RA ở đầu): ");
            this.studentId = sc.nextLine();
            if (this.studentId.startsWith("RA")) {
                checkStudenId = false;
            } else {
                System.out.println("Vui lòng nhập RA trước");
            }
        } while (checkStudenId);

        // tên sv
        do {
            System.out.print("Nhập tên sinh viên: ");
            this.studentName = sc.nextLine();
            if (this.studentName.length() < 5) {
                System.out.println("tên không được dưới 5 ký tự, mời nhập lại.");
            } else if (this.studentName.length() > 50) {
                System.out.println("tên không được quá 50 ký tự, mời nhập lại.");
            }
        } while (this.studentName.length() < 5 || this.studentName.length() > 50);

        // tuổi
        do {
            System.out.print("Nhập tuổi (>=18, <100): ");
            while (!sc.hasNextInt()) {
                sc.next();
            }
            this.age = sc.nextInt();
        } while (this.age < 18 || this.age > 100);


        // giới tính
        do {
            System.out.print("Nhập giới tính(nam/nữ): ");
            this.gender = sc.next();
        } while (!this.gender.equals("nam") && !this.gender.equals("nữ"));

        // số điện thoại
        do {
            System.out.print("Nhập số điện thoại: ");
            this.phone = sc.next();
            if (this.phone.startsWith("0")) {
                checkPhone = false;
            } else {
                System.out.println("Số điện thoại phải bắt đầu bằng số 0");
                System.out.println("Vui lòng nhập lại!");
            }
        } while (checkPhone);

        // địa chỉ
            System.out.print("nhập địa chỉ: ");
        do {
            this.address = sc.nextLine();
        } while (this.address.length() < 1 || this.address.length() > 100);

        // html
        do {
            System.out.print("nhập điểm html: ");
            this.html = sc.nextInt();
        } while (this.html < 0 || this.html > 10);

        // css

        do {
            System.out.print("nhập điểm css: ");
            this.css = sc.nextInt();
        } while (this.css < 0 || this.css > 10);

        // javascript

        do {
            System.out.print("nhập điểm javascript: ");
            this.javascript = sc.nextInt();
        } while (this.javascript < 0 || this.javascript > 10);
    }


    public void displayData() {
        int day = Year.now().getValue();
        System.out.printf("%s%-20s%s%s", "Mã sinh viên: ", studentId, "Tên sinh viên: ", studentName);
        System.out.printf("%s%-24d%s%-20s%s%s", "\nNăm sinh: ", (day - age), "Giới tính: ", gender, "Điện thoại: ", phone);
        System.out.printf("%s%-56s%s%f", "\nĐịa chỉ: ", address, "Điểm Trung Bình: ", avgMark);
    }

    public void avgMark() {
        float avhMark = (html + css + 2 * javascript) / 4;
        this.avgMark = avhMark;
    }
}
