/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM;
import java.util.*;
/**
 *
 * @author LeMinh
 */
public class DanhSachNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma nhan vien: ");
            String ID = scanner.nextLine();
            if (ID.equals("") || ID == null) {
                break;
            }
            System.out.print("Nhap ho ten nhan vien: ");
            String name = scanner.nextLine();
            System.out.print("Nhap luong co ban: ");
            double luongCoBan = Double.parseDouble(scanner.nextLine());
            System.out.print("Ban thuoc phong ban nao (Hanh chinh/Kinh doanh): ");
            String phongBan = scanner.nextLine();
            if (phongBan.equalsIgnoreCase("Hanh chinh")) {
                System.out.print("Nhap ngay cong: ");
                double ngayCong = scanner.nextDouble();
                NhanVien newNV = new NhanVienHanhChinh(ID, name, luongCoBan, phongBan, ngayCong);
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Kinh doanh")) {
                System.out.print("Nhap luong kinh doanh: ");
                double luongKinhDoanh = scanner.nextDouble();
                NhanVien newNV = new NhanVienKinhDoanh(ID, name, luongCoBan, phongBan, luongKinhDoanh);
                list.add(newNV);
            } else {
                System.out.println("Vui long nhap lai phong ban va cac thong tin khac !");
            }

        } while (true);
    }
    
    public void xuat() {
        for (NhanVien nv : list) {
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
    }

    public void timNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can tim: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
                check = true;
                break;
            }
        }

        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        }
    }
    
    public void xoaNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                list.remove(nv);
                check = true;
                break;
            }
        }

        if (check == false) {
            System.out.println("Nhan vien khong ton tai !");
        } else {
            System.out.println("Nhan vien da bi xoa !");
        }
    }
    
    public void capNhatNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien can cap nhat: ");
        String IDFind = sc.nextLine();
        NhanVien found = null;
        int index = 0;
        for (NhanVien nv : list) {
            if (IDFind.equalsIgnoreCase(nv.getID())) {
                found = nv;
                index = list.indexOf(nv);
                break;//khong co truong hop trung id
            }
        }
        if (found != null) {
            System.out.print("Nhap ma nhan vien: ");
            String ID = sc.nextLine();
            if (ID.equals("") || ID == null) {
                ID = found.getID();
            }
            System.out.print("Nhap ho ten nhan vien: ");
            String name = sc.nextLine();
            if (name.equals("") || name == null) {
                name = found.getHoTen();
            }
            System.out.print("Nhap luong co ban: ");
            String luongCoBan = sc.nextLine();
            if (luongCoBan.equals("") || luongCoBan == null) {
                luongCoBan = String.valueOf(found.getLuongCoBan());
            }
            if (found instanceof NhanVienHanhChinh) {
                System.out.print("Nhap ngay cong: ");
                String ngayCong = sc.nextLine();
                if (ngayCong.equals("") || ngayCong == null) {
                    ngayCong = String.valueOf(((NhanVienHanhChinh) found).getNgayCong());
                }
                NhanVien nv = new NhanVienHanhChinh(ID, name, Double.parseDouble(luongCoBan), "Hanh Chinh", Double.parseDouble(ngayCong));
                list.set(index, nv);
            }
            if (found instanceof NhanVienKinhDoanh) {
                System.out.print("Nhap luong kinh doanh: ");
                String luongKinhDoanh = sc.nextLine();
                if (luongKinhDoanh.equals("") || luongKinhDoanh == null) {
                    luongKinhDoanh = String.valueOf(((NhanVienKinhDoanh) found).getLuongKinhDoanh());
                }
                NhanVien nv = new NhanVienKinhDoanh(ID, name, Double.parseDouble(luongCoBan), "Kinh doanh", Double.parseDouble(luongKinhDoanh));
                list.set(index, nv);
            }
        }else {
            System.out.println("Nhan vien khong ton tai !");
        }
    }
    
    public void sortName() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getHoTen().compareTo(nv2.getHoTen());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void sortLuong() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.getLuong() > nv2.getLuong()) return 1;
                else return -1;
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void xuatTop5() {
        Collections.sort(list, (a, b) -> (int) (b.getLuong() - a.getLuong()));
        for (int i = 0; i < 5; i++) {
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", list.get(i).getID(), list.get(i).getHoTen(), list.get(i).getPhongBan(), list.get(i).getLuong());
        }
    }
    
        public void menu () {
            Scanner s = new Scanner(System.in);
            int chon = 0;
            do {
                System.out.println("\nMenu chuong trinh");
                System.out.println("1. Nhập danh sách nhân viên");
                System.out.println("2. Xuất thông tin các nhân viên");
                System.out.println("3. Tìm nhân viên theo mã");
                System.out.println("4. Xoá nhân viên theo mã");
                System.out.println("5. Cập nhật thông tin nhân viên theo mã");
                System.out.println("6. Sắp xếp nhân viên theo họ tên");
                System.out.println("7. Sắp xếp nhân viên theo thu nhập");
                System.out.println("8. Xuất 5 nhân viên có thu nhập cao nhất");
                System.out.println("0. Thoat");
                System.out.print("Moi ban chon: ");

                chon = s.nextInt();
                if (chon != 0) {
                    switch (chon) {
                        case 0:
                            break;
                        case 1:
                            nhap();
                            break;
                        case 2:
                            xuat();
                            break;
                        case 3:
                            timNV();
                            break;
                        case 4:
                            xoaNV();
                            break;
                        case 5:
                            capNhatNV();
                            break;
                        case 6:
                            sortName();
                            break;
                        case 7:
                            sortLuong();
                            break;
                        case 8:
                            xuatTop5();
                            break;
                        default:
                            System.out.println("Nhap sai, nhap lai!");
                    }
                }

            } while (chon != 0);
        }
}
