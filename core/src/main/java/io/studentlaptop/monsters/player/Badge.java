package io.studentlaptop.monsters.player;

public enum Badge {
    ZEPHYR(new Builder()),
    HIVE(new Builder()),
    PLAIN(new Builder()),
    FOG(new Builder()),
    STORM(new Builder()),
    MINERAL(new Builder()),
    GLACIER(new Builder()),
    RISING(new Builder()),
    BOULDER(new Builder()),
    CASCADE(new Builder()),
    THUNDER(new Builder()),
    RAINBOW(new Builder()),
    SOUL(new Builder()),
    MARSH(new Builder()),
    VOLCANO(new Builder()),
    EARTH(new Builder()),
    ;

    private final String badgeTexturePath;
    private final String gymLeaderTexturePath;

     Badge(Builder builder) {
         this.badgeTexturePath = builder.badgeTexturePath;
         this.gymLeaderTexturePath = builder.gymLeaderTexturePath;
     }

     public int getBadgeNumber() {
         return this.ordinal() + 1;
     }

     public String getBadgeTexturePath() {
         return this.badgeTexturePath;
     }

     public String getGymLeaderTexturePath() {
         return this.gymLeaderTexturePath;
     }

    private static class Builder {
        private String badgeTexturePath;
        private String gymLeaderTexturePath;

        private Builder badgeTexturePath(String badgeTexturePath) {
            this.badgeTexturePath = badgeTexturePath;
            return this;
        }

        private Builder gymLeaderTexturePath(String gymLeaderTexturePath) {
            this.gymLeaderTexturePath = gymLeaderTexturePath;
            return this;
        }
    }
}
