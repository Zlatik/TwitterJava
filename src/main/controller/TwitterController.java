package main.controller;

import main.entity.Tweet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TwitterController {
    @RequestMapping(value = "/getTweets")
    public String getTweets() {
        return "";
    }

    @RequestMapping(value = "/postTweet", method = RequestMethod.POST)
    public void postTweet() {

    }

    @RequestMapping(value = "/deleteTweet", method = RequestMethod.DELETE)
    public void deleteTweet() {

    }

    @RequestMapping(value = "/editTweet", method = RequestMethod.PUT)
    public void editExistingTweet() {

    }
}
