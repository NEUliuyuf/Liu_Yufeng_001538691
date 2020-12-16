/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.MarketModel;

import java.util.ArrayList;

/**
 *
 * @author 43999
 */
public class ChannelList {
    ArrayList<Channel> channelList;

    public ChannelList() {
        channelList = new ArrayList();
    }
    
    public void addChannel(Channel channel){
        channelList.add(channel);
    }
    
    public Channel searchChannel(String name){
        for (Channel c : channelList){
            if(c.getChannel().equals(name)){
                return c;
            }
        }
        return null;
    }
    
    public void DeleteChannel(Channel c){
        for (int i = 0; i < channelList.size(); i++){
            if(channelList.get(i).equals(c)){
                channelList.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Channel> getChannelList() {
        return channelList;
    }
    
    
    
}
