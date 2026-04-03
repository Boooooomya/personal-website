package com.example.my_resume;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ResumeController {

    @GetMapping("/")
    public String index(Model model) {
        // 個人資訊
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("name", "程式開發實踐者");
        personalInfo.put("title", "Full-stack Developer / Student");
        personalInfo.put("email", "contact@example.com");
        personalInfo.put("phone", "0912-345-678");
        personalInfo.put("location", "台北, 台灣");
        personalInfo.put("github", "https://github.com");
        personalInfo.put("bio", "熱衷於 Java 與 Python 開發，致力於撰寫乾淨、高效且可維護的程式碼。目前專注於 Spring Boot 網頁應用與資料分析。");
        model.addAttribute("personal", personalInfo);

        // 技能分類
        Map<String, List<String>> skills = new HashMap<>();
        skills.put("語言", Arrays.asList("Java", "Python", "SQL", "HTML/CSS", "JavaScript"));
        skills.put("框架", Arrays.asList("Spring Boot", "Spring MVC", "Thymeleaf", "Flask"));
        skills.put("工具", Arrays.asList("Git", "Maven", "Docker", "VS Code", "IntelliJ"));
        model.addAttribute("skillGroups", skills);

        // 工作/實習經驗
        List<Map<String, String>> experience = Arrays.asList(
            createEntry("軟體實習生", "某科技公司", "2023 - 現在", "參與內部管理系統開發，協助優化 API 效能。"),
            createEntry("專案助理", "學校實驗室", "2022 - 2023", "負責資料清洗與 Python 自動化腳本編寫。")
        );
        model.addAttribute("experiences", experience);

        // 專案經驗
        List<Map<String, String>> projects = Arrays.asList(
            createEntry("學生成績分析程式", "Python, Pandas", "連結", "自動化處理大量學籍資料，並生成視覺化圖表。"),
            createEntry("個人履歷網站", "Java, Spring Boot", "連結", "使用 Spring Boot 構建的響應式個人作品集網站。")
        );
        model.addAttribute("projects", projects);

        // 教育背景
        List<Map<String, String>> education = Arrays.asList(
            createEntry("資訊工程學系", "國立某某大學", "2021 - 2025 (預計畢業)", "主修軟體工程與資料庫管理。")
        );
        model.addAttribute("educationList", education);
        
        return "index";
    }

    private Map<String, String> createEntry(String title, String org, String date, String desc) {
        Map<String, String> entry = new HashMap<>();
        entry.put("title", title);
        entry.put("org", org);
        entry.put("date", date);
        entry.put("desc", desc);
        return entry;
    }
}