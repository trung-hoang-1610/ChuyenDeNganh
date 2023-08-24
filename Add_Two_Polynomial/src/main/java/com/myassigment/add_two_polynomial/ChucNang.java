package com.myassigment.add_two_polynomial;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.InputMismatchException;

public class ChucNang {

    DaThuc daThuc1 = new DaThuc();
    DaThuc daThuc2 = new DaThuc();

    public static void ghiDaThucVaoFile(DaThuc daThuc1, DaThuc daThuc2, DaThuc tongDaThuc, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, true);

            HangTu hangTu1 = daThuc1.head;
            HangTu hangTu2 = daThuc2.head;
            HangTu hangTu3 = tongDaThuc.head;

            while (hangTu1 != null) {

                if (hangTu1 == daThuc1.head) {
                    writer.write("(");
                }
                if (hangTu1 != null) {
                    if (hangTu1.soMu == 0) {
                        writer.write(hangTu1.heSo + "");
                    } else if (hangTu1.soMu == 1) {
                        if (hangTu1.heSo == 1) {
                            writer.write(hangTu1.bien);
                        } else {
                            writer.write(hangTu1.heSo + hangTu1.bien);
                        }
                    } else {
                        writer.write(hangTu1.heSo + hangTu1.bien + "^" + hangTu1.soMu);
                    }

                    if (hangTu1.next != null) {
                        if (hangTu1.next.heSo >= 0) {
                            writer.write(" + ");
                        } else {
                            writer.write(" ");
                        }
                    } else {
                        writer.write(") + ");
                    }
                    hangTu1 = hangTu1.next;
                }

            }

            while (hangTu2 != null) {
                if (hangTu2 == daThuc2.head) {
                    writer.write("(");
                }
                if (hangTu2 != null) {
                    if (hangTu2.soMu == 0) {
                        writer.write(hangTu2.heSo + "");
                    } else if (hangTu2.soMu == 1) {
                        if (hangTu2.heSo == 1) {
                            writer.write(hangTu2.bien);
                        } else {
                            writer.write(hangTu2.heSo + hangTu2.bien);
                        }
                    } else {
                        writer.write(hangTu2.heSo + hangTu2.bien + "^" + hangTu2.soMu);
                    }

                    if (hangTu2.next != null) {
                        if (hangTu2.next.heSo >= 0) {
                            writer.write(" + ");
                        } else {
                            writer.write(" ");
                        }
                    } else {
                        writer.write(") = ");
                    }
                    hangTu2 = hangTu2.next;

                }

            }

            while (hangTu3 != null) {
                if (hangTu3 != null) {
                    if (hangTu3.soMu == 0) {
                        writer.write(hangTu3.heSo + "");
                    } else if (hangTu3.soMu == 1) {
                        if (hangTu3.heSo == 1) {
                            writer.write(hangTu3.bien);
                        } else {
                            writer.write(hangTu3.heSo + hangTu3.bien);
                        }

                    } else {
                        writer.write(hangTu3.heSo + hangTu3.bien + "^" + hangTu3.soMu);
                    }

                    if (hangTu3.next != null) {
                        if (hangTu3.next.heSo >= 0) {
                            writer.write(" + ");
                        } else {
                            writer.write(" ");
                        }
                    } else {
                        writer.write(".");
                    }
                    hangTu3 = hangTu3.next;
                }

            }

            writer.write(System.lineSeparator());

            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }

    public static String docDaThucTuFile(String fileName) {
        String lichSu = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Phân tích và hiển thị định dạng từng dòng
                String[] parts = line.split(",");
                for (String part : parts) {
                    lichSu += (formatExpression(part) + "");
                }
                lichSu += "\n"; // Xuống dòng sau mỗi dòng
            }
        } catch (FileNotFoundException e) {

            System.out.println("Khong tim thay " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lichSu;
    }

    private static String formatExpression(String expression) {
        // Xử lý và định dạng biểu thức ở đây
        return expression.trim();
    }

    public void nhapDaThucNhieuAn(String daThuc1, String daThuc2) {

 
          
            Pattern pattern = Pattern.compile("([+-]?\\d*)([-]?[a-zA-Z1-9]+)(\\^\\d+)?");
            Matcher matcher = pattern.matcher(daThuc1);

            while (matcher.find()) {
                String hesoStr = matcher.group(1);
                String bien = matcher.group(2);
                String soMuStr = matcher.group(3);

                int heSo = (hesoStr.isEmpty()) ? 1 : Integer.parseInt(hesoStr);
                int soMu = (soMuStr == null) ? 1 : Integer.parseInt(soMuStr.substring(1));

                this.daThuc1.themHangTu(heSo, soMu, bien);
            }

            
            Pattern pattern2 = Pattern.compile("([+-]?\\d*)([-]?[a-zA-Z1-9]+)(\\^\\d+)?");
            Matcher matcher2 = pattern2.matcher(daThuc2);

            while (matcher2.find()) {
                String hesoStr = matcher2.group(1);
                String bien = matcher2.group(2);
                String soMuStr = matcher2.group(3);

                int heSo = (hesoStr.isEmpty()) ? 1 : Integer.parseInt(hesoStr);
                int soMu = (soMuStr == null) ? 1 : Integer.parseInt(soMuStr.substring(1));

                this.daThuc2.themHangTu(heSo, soMu, bien);
            }
     

    }

    public DaThuc tinhTongDaThuc() {

        DaThuc tongHaiDaThuc = daThuc1.congHaiDaThuc(daThuc2);
        ghiDaThucVaoFile(daThuc1, daThuc2, tongHaiDaThuc, "C:\\Users\\Trung\\IdeaProjects\\Add Two Polynomial\\src\\Data\\DaThuc.txt");
        clearCache();
        return tongHaiDaThuc;
    }
    
    public DaThuc tinhHieuDaThuc() {

        DaThuc tongHaiDaThuc = daThuc1.truHaiDaThuc(daThuc2);
        ghiDaThucVaoFile(daThuc1, daThuc2, tongHaiDaThuc, "C:\\Users\\Trung\\IdeaProjects\\Add Two Polynomial\\src\\Data\\DaThuc.txt");
        clearCache();
        return tongHaiDaThuc;
    }

    public void clearCache() {
        daThuc1.head.next = null;
        daThuc1.head = null;

        daThuc2.head.next = null;
        daThuc2.head = null;
    }

    public void showDaThuc1() {
        System.out.print("Da thuc 1: ");
        daThuc1.show();
        System.out.println();
    }

    public void showDaThuc2() {
        System.out.print("Da thuc 2: ");
        daThuc2.show();
        System.out.println();
    }

    public String showTong2DaThuc() {
        String tong;
        //showDaThuc1();
        //showDaThuc2();

        System.out.print("Tong 2 da thuc: ");
        tong = tinhTongDaThuc().show();
        //System.out.println();
        return tong;
    }
    public String showHieu2DaThuc() {
        String tong;
        //showDaThuc1();
        //showDaThuc2();

        System.out.print("Tong 2 da thuc: ");
        tong = tinhHieuDaThuc().show();
        //System.out.println();
        return tong;
    }

    public String showDanhSachDaThuc() {
        return docDaThucTuFile("C:\\Users\\Trung\\IdeaProjects\\Add Two Polynomial\\src\\Data\\DaThuc.txt");
    }
}
