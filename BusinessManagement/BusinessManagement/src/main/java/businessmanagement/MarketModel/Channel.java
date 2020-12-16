/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.MarketModel;

/**
 *
 * @author 43999
 */
public class Channel {
    String channel;

    public Channel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
    
    @Override
    public String toString(){
        return channel;
    }
    
}
