import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.element.Element;
import javax.print.event.PrintEvent;

import javax.swing.FocusManager;
public class HumanResources  {
    public static void main(String[] args) {
       int dembp = 0;
       int demnv = 0;
       Department ddd = new Department();
       Scanner imput = new Scanner(System.in);
        // nhap du lieu bo phan
       System.out.println("nhap du lieu bo phan: "); 
       for(int i = 0; i < 2;i ++)
       {
           dembp ++;
           fudep(imput);
       }
       // nhap du lieu nhan vien
       System.out.println("nhap so luong nhan vien");
       int slnv = imput.nextInt();
       for (int j = 0; j < slnv;j++)
       {
            nhapnv(imput);
            demnv ++;
       }

       ddd.setnumv(demnv); // set up so luong nhan vien 

       int run = 1; // khoi tao while1i nhan vien theo tung bo phan nhan 3");
       while (run == 1)
       {
           System.out.println("ban muon hien thi thong tin nhan vien 1");
           System.out.println("ban muon hien thi bo phan nhan vien nhan 2");
           System.out.println("ban muon hien thi nhan vien theo bo phan 3");
           System.out.println("ban muon them thong tin nhan vien moi nhan 4");
           System.out.println("ban muon tim kiem nhan vien nhan phim 5");
           System.out.println("ban muon sap xep luong 6");
           System.out.println("ban muon thoat nhan phim so bat ki ");          
           int code = 0;
           code = imput.nextInt();
           // chuc nang 1
           if (code == 1)
           {
               for(int z = 0 ; z < emp.size(); z++)
               {
                   emp.get(z).displayInformation();
                   System.out.println("");
               }
               for(int m = 0; m < mana.size(); m++)
               {
                   mana.get(m).displayInformation();
                   System.out.println("");
               }
           }

// chuc nang hai
           else if ( code == 2)
           {
               for(int t = 0 ; t < 2; t++)
               {
                   dep.get(t).toSting();
                   System.out.println("");
               }
               System.out.println("so nhan vien hien co: "+ddd.getnumv());
               System.out.println("");
           }
           // chuc nang ba
           else if(code == 3)
           {
               System.out.println("ban muon hien thi nhan vien (nhap 1) hay quan ly (nhap khac 1)");
               int testnv = imput.nextInt();
               if(testnv == 1)
               {
                System.out.println("danh sach nhan vien: ");
                for(int z1 = 0 ; z1 < emp.size(); z1++)
                {
                    emp.get(z1).displayInformation();
                    System.out.println("");
                }
               }
               else
               {
                System.out.println("danh sach nhan vien quan ly");  
                for(int m1 = 0; m1 < mana.size(); m1++)
                {
                    mana.get(m1).displayInformation();
                    System.out.println("");
                }
               }
            }
            // chuc nang bon
               else if(code == 4)
                {
               System.out.println("ban them nhan vien (nhap 1) hay quan ly (nhap khac 1)");
               int testnv1 = imput.nextInt();
               if(testnv1 == 1)
               {    
                    System.out.println("moi ban nhap thong tin nhan vien");
                    fuemp(imput);
                    demnv ++;
               }
               else
               {
                System.out.println("moi ban nhap thong tin quan ly");  
                fumanager(imput);
                demnv ++;
                }
                ddd.setnumv(demnv);

            }
            //chuc nang 5
            else if (code == 5)
            {
                int seach1 = 0;
                String seach2 = "0";
                int codeseach = 0;
                int test = 0;
                String a = "";
                System.out.println("ban muon tim kiem bang ten (nhap 1) hay bang ma nhan vien (nhap 2)");
                codeseach = imput.nextInt();
                if(codeseach == 1)
                {
                    System.out.println("nhap thong tin can tim");
                    a = imput.nextLine();
                    seach2 = imput.nextLine();
                    System.out.print(seach2);
                    for (int z6 = 0; z6 < mana.size();z6 ++)
                    {
                        if (mana.get(z6).getname().equalsIgnoreCase(seach2))
                        {
                            mana.get(z6).displayInformation();
                            test ++;
                        }
                    }
                    for (int m6 = 0; m6 < emp.size();m6 ++)
                    {
                        if (emp.get(m6).getname().equalsIgnoreCase(seach2))
                        {
                            emp.get(m6).displayInformation();
                            test ++;
                        }
                    }

                }
                
                else // tim theo ma nhan vien
                {
                    System.out.println("nhap thong tin can tim");
                    seach1 = imput.nextInt();
                    for (int z61 = 0; z61 < mana.size();z61 ++)
                    {
                        if (mana.get(z61).getcode() == seach1)
                        {
                            mana.get(z61).displayInformation();
                            test ++;
                        }
                    }
                    for (int m61 =0; m61 < emp.size();m61 ++)
                    {
                        if (emp.get(m61).getcode() == seach1)
                        {
                            emp.get(m61).displayInformation();
                            test ++;
                        }
                    }
                }
                if (test == 0)
                {
                    System.out.println("khong co gia tri phu hop");
                }
            }
            else if(code == 6)
                {
                    inluong(imput);
                }
            else
            {
                System.out.println("cam on ban da su dung: ");
                run = 0;
            }
        }
    }
       
       // function nhap thong tin quan ly
    public static void inluong( Scanner imput)
    {
        int max1 = 0;
        int max2 = 0;
        int tt = -1;
        int tt2 = -1;
        int ttt = -1;
        int ttt2 = -1;
        ArrayList <Integer> thutu = new ArrayList<Integer>(); 
        System.out.println("ban muon hien thi luong giam dan(nhan 1) hay tang dan(nhan phinm khac)");
        int test = imput.nextInt();
        for(int t = 0; t < emp.size() +mana.size() ; t++) // tim gia tri lon nhat
        {
            max1 = 0;
            tt = -1;
            tt2 = -1;
            for(int i = 0; i< emp.size();i++)
                {
                    if (max2 == 0)
                    {
                        if (emp.get(i).calculateSalary() > max1)
                        {
                            max1 = emp.get(i).calculateSalary();
                            tt = i;
                        }
                    }
                    else
                    {
                        if (emp.get(i).calculateSalary() >= max1 && emp.get(i).calculateSalary() <= max2 && ttt != i )
                        {
                            max1 = emp.get(i).calculateSalary();
                            tt = i;
                        }
                    }
                }
            for(int j = 0; j < mana.size();j++)
                {
                    if (max2 == 0)
                    {
                        if (mana.get(j).calculateSalary() > max1)
                        {
                            max1 = mana.get(j).calculateSalary();
                            tt2 = j;
                        }
                    }
                    else
                    {
                        if (mana.get(j).calculateSalary() >= max1 && mana.get(j).calculateSalary() <= max2 && ttt2 != j)
                        {
                            max1 = mana.get(j).calculateSalary();
                            tt2 = j;
                        }
                    }
                }
            max2 = max1;
            if (tt2 == -1) // luu vi tri cua nhan vien
            {
                ttt = tt;
                thutu.add(tt);
                thutu.add(0);
            }
            else    // luu vi tri cua quan ly
            {
                ttt2 = tt2;
                thutu.add(tt2);
                thutu.add(1);
            }
            
        }
        if(test == 1) // in theo thu tu
        {
            for( int k = 0; k < thutu.size() ; k = k+2 )
            {
                if(thutu.get(k+1) == 0)
                {
                    emp.get(thutu.get(k)).displayInformation();;
                }
                else
                {
                    mana.get(thutu.get(k)).displayInformation();
                }
            }
        }
        else
        {
            System.out.println("y");
            for( int mm = thutu.size() -1; mm > 0 ; mm = mm-2 )
            {
                if(thutu.get(mm) == 0)
                {
                    emp.get(thutu.get(mm-1)).displayInformation();
                    System.out.println("");
                }
                else
                {
                    mana.get(thutu.get(mm-1)).displayInformation();
                    System.out.println("");
                }
            }
        }
    

    }
    public static void fumanager(Scanner imput)
        {
            String strx = "";
            int x = 0;
            String z ="";
            Manager manager1 = new Manager(); 
            System.out.print("nhap code: ");
            x = imput.nextInt();
            manager1.setcode(x);

            z = imput.nextLine();
            System.out.print("nhap chuc danh:(Business Leader or Project Leader or Technical Leader) ");
            strx = imput.nextLine();
            manager1.setchucdanh(strx);

            System.out.print("nhap ten: ");                
            strx = imput.nextLine();
            manager1.setname(strx);

            System.out.print("nhap tuoi: ");
            x = imput.nextInt();
            manager1.setage(x);
            z = imput.nextLine();
            System.out.print("noi lam viec: ");
            strx = imput.nextLine();
            manager1.setwork(strx);

            System.out.print("ngay bat dau lam: ");
            strx = imput.next();
            manager1.setngaylam(strx);

            System.out.print("so ngay nghi: ");
            x = imput.nextInt();
            manager1.setholiday(x);

            manager1.luongql();
            mana.add(manager1);
        }
    // function nhap thong tin nhan vien 
    public static void fuemp(Scanner imput)
    {

        String z = "";
        String strep = "";
        int intx = 0;
        Employee epp = new Employee();

        System.out.print("nhap code: ");
        intx = imput.nextInt();
        epp.setcode(intx);

        System.out.print("nhap so gio lam them ");
        intx = imput.nextInt();
        epp.settime(intx);

        z = imput.nextLine();
        System.out.print("nhap ten: ");  
        strep = imput.nextLine();
        epp.setname(strep);

        System.out.print("nhap tuoi: ");
        intx = imput.nextInt();
        epp.setage(intx);

        System.out.print("noi lam viec: ");
        z = imput.nextLine();
        strep = imput.nextLine();
        epp.setwork(strep);

        System.out.print("ngay bat dau lam: ");
        strep = imput.next();
        epp.setngaylam(strep);

        System.out.print("so ngay nghi: ");
        intx = imput.nextInt();
        epp.setholiday(intx);

        epp.luongnv();

        emp.add(epp);
    }
    // function nhap du lieu bo phan
    public static void fudep(Scanner imput)
    {
        String z = "";
        String stx ="";
        int intx = 0;
        Department depp = new Department();

        System.out.println("nhap ma bo phan: " );
        intx = imput.nextInt();
        depp.setcodebp(intx);
        z = imput.nextLine();
        System.out.println("nhap ten bo phan: " );
        
        stx = imput.nextLine();
        depp.settenbp(stx);
        dep.add(depp);

    } 
    // tao han nhap ca nhan vien lan quan ly
    public static void nhapnv(Scanner imput)
    {
        System.out.println("ban muon nhap nhan vien (nhap 1) hay quan ly (nham khac 1)");
            int test = imput.nextInt();
            if (test == 1)
            {
                fuemp(imput);
            }
            else 
            {
                fumanager(imput);
            }

    }
 public static  ArrayList <Manager> mana = new ArrayList<Manager>(); // Array list quan ly
 public static  ArrayList <Employee> emp = new ArrayList<Employee>(); // array list nhan vien
 public static  ArrayList <Department> dep = new ArrayList<Department>();         //array list chua bo phan
}

// class chua thong tin chung
abstract class Staff
{
    public int code;//ma nhan vien
    public String name;// ten
    public int age;//tuoi
    public double hsl = 1.4;//he so luong
    public String addwork;//noi lam viec
    public String ngaylam;
    public int holyday; //ngay nghi
    public int hours;// gio lam
    abstract void displayInformation();
}
// class nhan vien
class Employee extends Staff implements ICalculator
{
    private int timel; // gio lam them
    private int luong ;
    public final void settime( int t)
    {
        timel = t;        
    }

    public final void setcode(int c)
    {
        code = c;
    }

    public final void setname( String n)
    {
        name = n;
    }

    public final void setage( int n)
    {
        age = n;
    }

    public final void setwork( String n)
    {
        addwork = n;
    }

    public final void setngaylam( String n)
    {
        ngaylam = n;
    }

    public final void setholiday( int n)
    {
        holyday = n;
    }
    
    public int getcode()
    {
        return code;
    }
    public String getname ()
    {
        return name;
    }
    public int  gettimel()
    {
        return timel;
    }
    public int calculateSalary()
    {
        return luong;
    }
    void displayInformation()
    {
        System.out.println("so gio lam them: "+timel);
        System.out.println("code nhan vien: "+ code);
        System.out.println("ten nhan vien: "+name);
        System.out.println("thuoi nhan vien : "+age);
        System.out.println("noi lam viec : "+addwork);
        System.out.println("ngay bat dau lam : "+ngaylam);
        System.out.println("so ngay nghi : "+ holyday);
       System.out.println("luong nhan vien la: "+ luong); 
    }
    public void luongnv()
    {
        luong =  (int)(hsl * 3000000) + timel * 200000;

    }
    public void luongql()
    {

    }
}
// class quan ly
class Manager extends Staff implements ICalculator
{
    private String chucdanh;
    private int luong;
    public final void setchucdanh( String cd)
    {   

        chucdanh = cd;
    }
    public final void setcode(int c)
    {
        code = c;
    }
    public final void setage( int n)
    {
        age = n;
    }
    public final void setwork( String n)
    {
        addwork = n;
    }
    public final void setngaylam( String n)
    {
        ngaylam = n;
    }
    public final void setholiday( int n)
    {
        holyday = n;
    }
    public final void setname( String n)
    {
        name = n;
    }
    public int getcode()
    {
        return code;
    }
    public String getname ()
    {
        return name;
    }
    public String getchucdanh()
    {
        return chucdanh;
    }
    public int calculateSalary()
    {
        return luong;
    }
    public void luongnv()
    {
        System.out.print("Sdfs");
    }
    public void luongql()
    {
        int x = 0;
        if(chucdanh.equalsIgnoreCase("Business Leader"))
        {
            x = 8000000;
        }
        else if (chucdanh.equalsIgnoreCase("Project Leader"))
        {
            x = 5000000;
        }
        else
        {
            x = 6000000;
        }
        luong = (int)hsl*5000000+x;
    }
    void displayInformation()
    {
        System.out.println("code nhan vien: "+ code);
        System.out.println("code nhan vien chuc danh : "+ chucdanh);
        System.out.println("ten nhan vien: "+name);
        System.out.println("thuoi nhan vien : "+age);
        System.out.println("noi lam viec : "+addwork);
        System.out.println("ngay bat dau lam : "+ngaylam);
        System.out.println("so ngay nghi : "+ holyday);
        System.out.println("luong quan ly "+chucdanh+" la: " + luong);
    }
}
interface ICalculator
{
    void luongnv();
    void luongql();
}
// class thong tin bo phan
class Department
{
    private int codebp;//ma so bo phan
    private String tenbp;// ten bo phan
    private int numnv;//so nhan vien trong cong ty
    public void toSting()
    {
        System.out.println("ma bo phan: "+codebp);// printIn
        System.out.println("ten bo phan: "+tenbp);
    }
    public final void setcodebp(int c)
    {
        codebp = c;
    }
    public final void settenbp(String t)
    {
        tenbp = t;
    }
    public final void setnumv(int n)
    {
        numnv = n;
    }   
    public final int getcodebp()
    {
        return codebp;
    }
    public final String gettenbp()
    {
        return tenbp;
    }
    public final int getnumv()
    {
       return numnv;
    }   
}