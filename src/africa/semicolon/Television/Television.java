package africa.semicolon.Television;

public class Television {
    private boolean isOn;
    private int tvChannel;
    private String tvName;
    private int tvVolume;
    private int tvBrightness;


    public Television(String name) {
        tvName = name;
    }


    public void setisOn(boolean tvisOn) {
        isOn = tvisOn;
    }

    public boolean getisOn() {
        return isOn;
    }

    public void settvChannel(int tvChannelIsSet) {
        tvChannel = tvChannelIsSet;
    }

    public int gettvChannel() {
        return tvChannel;
    }

    public void settvName(String appleTv) {
        tvName = appleTv;
    }

    public String gettvName() {
        return tvName;
    }

    public void changetvChannel(int changeTvChannel) {
        tvChannel = changeTvChannel;
    }

    public int getchangetvChannel() {
        return tvChannel;
    }

    public void settvVolume(int tvHasVolume) {
        tvVolume = tvHasVolume;
    }

    public int gettvVolume() {
        return tvVolume;
    }


    public void settvBrightness(int tvIsBright) {
        tvBrightness = tvIsBright;
    }
    public int gettvBrightness() {
        return tvBrightness;
    }


    public void increaseBrightness() {
        if (tvBrightness >= 10 && tvBrightness < 100) {
            tvBrightness = tvBrightness + 10;        }else{
            tvBrightness = tvBrightness;
        }
    }


    public void decreaseBrightness() {
     if(tvBrightness >= 10 && tvBrightness < 100){tvBrightness = tvBrightness - 10;
    }else{
         tvBrightness = tvBrightness;
     }
}

   public void increasetvVolume() {
        if(tvVolume >= 10 && tvVolume < 100){tvVolume = tvVolume + 10;
    }else{
            tvVolume = tvVolume;
        }
    }


    public void decreasetvVolume() {
        if(tvVolume >= 10 && tvVolume < 100){tvVolume = tvVolume - 10;
    }else{
            tvVolume = tvVolume;
        }
}
}
