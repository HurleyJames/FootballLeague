package com.example.web;

import com.example.model.Team;
import com.example.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

    /**
     * 跳转至添加球员页面
     *
     * @param model
     * @return
     */
    @GetMapping("/player")
    public String toAddPage(Model model) {
        Collection<Team> teams = playerService.selectAllTeam();
        model.addAttribute("teams", teams);
        return "player/addPlayer";
    }

    /**
     * 跳转至查询球员页面
     *
     * @param model
     * @return
     */
    @GetMapping("/queryPlayer")
    public String toQueryPage(Model model) {
        Collection<Team> teams = playerService.selectAllTeam();
        model.addAttribute("teams", teams);
        return "player/queryPlayer";
    }


    /**
     * 跳转至射手榜页面
     *
     * @return
     */
    @GetMapping("/shooterboard")
    public String toShooterPage() {
        return "player/shooterboard";
    }


    /**
     * 点击退出跳转至登录界面
     *
     * @return
     */
    @GetMapping("/logout")
    public String toLogin() {
        return "login";
    }
}














