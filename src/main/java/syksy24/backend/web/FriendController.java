package syksy24.backend.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import syksy24.backend.domain.Friend;


@Controller
public class FriendController {

    // class-level variable to store the list of friends
    private static List<Friend> friendList = new ArrayList<>();

    // populate the list with friends
    static {
        friendList.add(new Friend("Pekka", "Pouta"));
        friendList.add(new Friend("Kyösti", "Pöysti"));
        friendList.add(new Friend("Maurizio", "Undercover"));
    }

    @RequestMapping("/friendlist")
    public String showFriends(Model model) {
        model.addAttribute("friends", friendList);
        return "friendList";
    }
    

    @GetMapping("/addfriend")
    public String newFriendInfo(Model model) {
        model.addAttribute("friend", new Friend());
        return "friendform";
    }

    @PostMapping("saveFriend")
    public String saveFriend(Friend friend) {
        friendList.add(friend);
        return "redirect:/friendlist";
    }

}
