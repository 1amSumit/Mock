package com.workshop1.MockServer1.service;

import com.workshop1.MockServer1.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    private Map<String, Student> students = new HashMap<>();

    // Constructor to initialize hardcoded student data
    public StudentService() {
        // Initialize with hardcoded USNs and names
    	// Initialize with the first set of USNs and names
        addStudent("001", "AARYA B ANAPUR", null);
        addStudent("004", "ADARSH N", null);
        addStudent("007", "AKASH B NAIK", null);
        addStudent("010", "AMRUTHA M BANAKAR", null);
        addStudent("013", "ANANNYA P ANVEKAR", null);
        addStudent("017", "ANJANA REDDY T", null);
        addStudent("020", "ANUSHREE B KUPPAST", null);
        addStudent("023", "BHAVANA S", null);
        addStudent("026", "BI BI SAFIYA", null);
        addStudent("029", "CHAMPA B G", null);
        addStudent("032", "CHIRANTHAN K A", null);
        addStudent("035", "DEEKSHA G", null);
        addStudent("038", "DEVENDR HARIJAN", null);
        addStudent("041", "DIVYA A HIREMATH", null);
        addStudent("044", "G M ANULAKSHMI", null);
        addStudent("047", "HIRANMAYI K M", null);
        addStudent("050", "JAGRUTHI B J", null);
        addStudent("053", "K SUBRAMANYAM", null);
        addStudent("056", "KARUR PRIYA", null);
        addStudent("059", "KAVYASHREE H.G", null);
        addStudent("062", "KOMAL P JADIMATH", null);
        addStudent("065", "M MOKSHITHA", null);
        addStudent("068", "MAHIMA C", null);
        addStudent("071", "MANOJ G M", null);
        addStudent("074", "MEGHANA B", null);
        addStudent("077", "MOHAMMED ANAS", null);
        addStudent("080", "NAMRATHA A N", null);
        addStudent("083", "NANDITHA A", null);
        addStudent("086", "NAYANA B S", null);
        addStudent("089", "NIKITA RAMANNA VADDAR", null);
        addStudent("092", "NITHIN KUMAR K N", null);
        addStudent("095", "POORVITHA Y", null);
        addStudent("098", "PRAJWAL M V", null);
        addStudent("101", "PRIYANKA G M", null);
        addStudent("104", "RAHUL CHANDAYYA GADDADAMATH", null);
        addStudent("107", "RAJATH PATIL L S", null);
        addStudent("110", "RAKESH S", null);
        addStudent("113", "RAMESH S", null);
        addStudent("116", "RATAN SHET", null);
        addStudent("120", "RITHASHA R VERNEKAR", null);
        addStudent("123", "S SURAJ", null);
        addStudent("126", "SADHANA JADAR", null);
        addStudent("129", "SAHANA K P", null);
        addStudent("132", "SAMEEKSHA R", null);
        addStudent("135", "SANJANA G S", null);
        addStudent("138", "SATYA SIRI MANJULA", null);
        addStudent("141", "SHASHIKUMAR B GUDDAPPANAVAR", null);
        addStudent("144", "SHREYA B KARJAGIMATH", null);
        addStudent("147", "SHREYAS S HAJARE", null);
        addStudent("150", "SINCHANA V", null);
        addStudent("153", "SPANDANA H N", null);
        addStudent("156", "SPURTHI K J", null);
        addStudent("159", "SRUSTI J KABBINAKANTIMATH", null);
        addStudent("162", "SUMANTH K M", null);
        addStudent("165", "TASBIHA TAZEEN", null);
        addStudent("168", "THEJASWINI C R", null);
        addStudent("171", "VACHAN C", null);
        addStudent("174", "VARSHITHA R HONNUR", null);
        addStudent("177", "VIJETHA N", null);
        addStudent("180", "VINAYAKA K", null);
        addStudent("183", "WASIA SAJID", null);
        addStudent("186", "YASHWANTH B M", null);
        addStudent("190", "OJHAS C S", null);
        addStudent("400", "ABDULKHADAR MAHAMADILIYAS PATEL", null);
        addStudent("401", "ABHISHEK K", null);
        addStudent("402", "AMULYA P", null);
        addStudent("408", "R KARTIK", null);
        addStudent("410", "SAHANASHREE G", null);
        addStudent("002", "AASHISH KUMAR JHA", null);
        addStudent("005", "ADITHI K A", null);
        addStudent("008", "AKSHATHA D K", null);
        addStudent("011", "AMSHU B PATEL", null);
        addStudent("014", "ANANYA T", null);
        addStudent("018", "ANKITHA REVAL V P", null);
        addStudent("021", "APEKSHAA S SHAMANUR", null);
        addStudent("024", "BHOOMIKA G S", null);
        addStudent("027", "BINDU K", null);
        addStudent("030", "CHANDAN R", null);
        addStudent("033", "D H PRAJWAL", null);
        addStudent("036", "DEEPIKA M RITTI", null);
        addStudent("039", "DHANUSH S K", null);
        addStudent("042", "DIVYA M", null);
        addStudent("045", "GAGAN KUMAR S V", null);
        addStudent("048", "INCHARA PATEL M S", null);
        addStudent("054", "KALMESH B AMBI", null);
        addStudent("057", "KAVANA K S", null);
        addStudent("060", "KEERTHI N G", null);
        addStudent("063", "KRUTHIK R", null);
        addStudent("066", "MADDELA GUNA NAGA VISHNU", null);
        addStudent("069", "MANASA G S", null);
        addStudent("072", "MANU M N", null);
        addStudent("075", "MEGHANA M PATEL", null);
        addStudent("078", "MOHAMMED NIHAR N R", null);
        addStudent("081", "NANDANA R", null);
        addStudent("084", "NANDITHA S", null);
        addStudent("087", "NEHA B", null);
        addStudent("090", "NIROOP P", null);
        addStudent("093", "P VASUDEV", null);
        addStudent("096", "PRADEEP S", null);
        addStudent("099", "PRAJWAL R KUDABALE", null);
        addStudent("102", "PRIYANKA P S", null);
        addStudent("105", "RAHUL N", null);
        addStudent("108", "RAJESHWARI H", null);
        addStudent("111", "RAKSHITHA M A", null);
        addStudent("114", "RANJITHA H G", null);
        addStudent("117", "RENUKA PRASAD V G", null);
        addStudent("121", "ROHANAA N G", null);
        addStudent("124", "SACHIN B", null);
        addStudent("127", "SAGAR K A", null);
        addStudent("130", "SAHANA M", null);
        addStudent("133", "SAMRUDH B S", null);
        addStudent("136", "SANJANA K R", null);
        addStudent("139", "SHARWARI K N", null);
        addStudent("142", "SHIVARAJ A R", null);
        addStudent("145", "SHREYA K S", null);
        addStudent("148", "SIDDARTH P MATHIHALLI", null);
        addStudent("151", "SNEHA G NADIG", null);
        addStudent("154", "SPANDANA K N", null);
        addStudent("157", "SRUJANA LAKSHMI D B", null);
        addStudent("160", "SUDHAKARA T N", null);
        addStudent("163", "SUNIL N HEGGANNANAVAR", null);
        addStudent("166", "TEJASWINI K S", null);
        addStudent("169", "U SANDEEP", null);
        addStudent("172", "VANITHA M S", null);
        addStudent("175", "VIJAY B M", null);
        addStudent("178", "VIKAS B K", null);
        addStudent("181", "VINAYAKA M C", null);
        addStudent("184", "YASHAS M P", null);
        addStudent("187", "YOGITA A CHOUGALA", null);
        addStudent("188", "MANASA P M", null);
        addStudent("414", "SHIVSAGAR", null);
        addStudent("412", "SANKALPA J", null);
        addStudent("413", "SHIVAKUMAR V", null);
        addStudent("411", "SAIVARSHITH G R", null);
        addStudent("417", "SYED ZUBAIR", null);
        addStudent("403", "CHETAN RAJU ATTANAGI", null);
        addStudent("416", "SUHAS S M", null);
        addStudent("003", "ABHISHEK G M", null);
        addStudent("006", "AISIRI S V", null);
        addStudent("009", "AMIT KUMAR YADAV", null);
        addStudent("012", "AMSHU BIDARI", null);
        addStudent("016", "ANISH REDDY K V", null);
        addStudent("019", "ANUSHA G D", null);
        addStudent("022", "BHARGAV M U", null);
        addStudent("025", "BHOOMIKA M P", null);
        addStudent("028", "C S DISHA", null);
        addStudent("031", "CHANDANA H S", null);
        addStudent("034", "DARSHITHA R", null);
        addStudent("037", "DEEPTHI A S", null);
        addStudent("040", "DHEERAJ KUMAR R", null);
        addStudent("043", "DIVYASHREE C H", null);
        addStudent("046", "GOUTHAM M", null);
        addStudent("049", "INCHARA Y S", null);
        addStudent("052", "K SANIYA", null);
        addStudent("055", "KARTHIK KADAM", null);
        addStudent("058", "KAVITHA N Y", null);
        addStudent("061", "KHUSHITHA R", null);
        addStudent("064", "LIKHITH L J", null);
        addStudent("067", "MADHUSHREE KUSUGAL", null);
        addStudent("070", "MANIKYA MAHANTESH HALINGALI", null);
        addStudent("073", "MEGHA MARUTI ALKUNTE", null);
        addStudent("076", "MEHTAB ALIYA", null);
        addStudent("079", "MOHAMMED RUMAN MALIK", null);
        addStudent("085", "NAVEEN M R", null);
        addStudent("088", "NIKHITA SHASHIKANT KULAGOD", null);
        addStudent("091", "NISCHAL L SAHUKAR", null);
        addStudent("094", "PALLAVI A R", null);
        addStudent("097", "PRAJWAL H P", null);
        addStudent("100", "PRERANA S", null);
        addStudent("103", "RACHANA B P", null);
        addStudent("106", "RAHUL PAUL", null);
        addStudent("109", "RAKESH M S", null);
        addStudent("112", "RAKSHITHA TALIKOTI", null);
        addStudent("115", "RASHMI JOGIHALLI", null);
        addStudent("118", "REVATHI N", null);
        addStudent("122", "ROHITH M", null);
        addStudent("128", "SAHANA K M", null);
        addStudent("131", "SAHANA S ANGADI", null);
        addStudent("134", "SANGAMESH G B", null);
        addStudent("140", "SHASHIDHAR VIRUPAXI SOMASAGAR", null);
        addStudent("143", "SHODHAN PATEL G S", null);
        addStudent("146", "SHREYA S B", null);
        addStudent("149", "SIDDESH N D", null);
        addStudent("152", "SNEHAN", null);
        addStudent("155", "SPOORTHI R P", null);
        addStudent("158", "SRUSHTI CHOUDHARI", null);
        addStudent("161", "SUHAS MALIPATIL", null);
        addStudent("164", "TANUJA M CHAVHAN", null);
        addStudent("167", "THEJAS H G", null);
        addStudent("170", "ULLAS A C", null);
        addStudent("173", "VARSHA P S", null);
        addStudent("176", "VIJAYADEEP PURUSHAN", null);
        addStudent("179", "VINAYA V", null);
        addStudent("182", "VISMAYA S M", null);
        addStudent("185", "YASHAWANTHA PATEL G S", null);
        addStudent("189", "K KIRAN KUMAR", null);
        addStudent("404", "KAKATI KARAN PRAVEEN", null);
        addStudent("405", "Kishan M Majagi", null);
        addStudent("406", "MANASA S", null);
        addStudent("407", "Puneeth Gowda", null);
        addStudent("409", "Ranjitha S", null);
        addStudent("415", "SRUJAN K M", null);
        // Add more students as needed
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public String addStudent(String usn, String name, String phoneNumber) {
        if (students.containsKey(usn)) {
            return "Student with USN " + usn + " already exists.";
        }
        students.put(usn, new Student(usn, name, phoneNumber));
        return "Student added.";
    }

    public String updateStudentName(String usn, String name) {
        Student student = students.get(usn);
        if (student == null) {
            return "Student not found.";
        }
        student.setName(name);
        return "Student name updated.";
    }

    public String updatePhoneNumber(String usn, String phoneNumber) {
        Student student = students.get(usn);
        if (student == null) {
            return "Student not found.";
        }
        student.setPhoneNumber(phoneNumber);
        return "Student phone number updated.";
    }

    public Student getStudentByUsn(String usn) {
        return students.get(usn);
    }

    public String deleteStudent(String usn) {
        if (students.remove(usn) == null) {
            return "Student not found.";
        }
        return "Student deleted.";
    }
}
