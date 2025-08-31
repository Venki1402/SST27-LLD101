package com.example.profiles;

/**
 * Immutable UserProfile using builder pattern.
 */
public final class UserProfile {
    private final String id;
    private final String email;
    private final String phone;
    private final String displayName;
    private final String address;
    private final boolean marketingOptIn;
    private final String twitter;
    private final String github;

    // getters
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getGithub() {
        return github;
    }

    public static class UserProfileBuilder {
        private String id;
        private String email;
        private String phone;
        private String displayName;
        private String address;
        private boolean marketingOptIn;
        private String twitter;
        private String github;

        public UserProfileBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserProfileBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserProfileBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserProfileBuilder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public UserProfileBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserProfileBuilder setMarketingOptIn(boolean marketingOptIn) {
            this.marketingOptIn = marketingOptIn;
            return this;
        }

        public UserProfileBuilder setTwitter(String twitter) {
            this.twitter = twitter;
            return this;
        }

        public UserProfileBuilder setGithub(String github) {
            this.github = github;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }

    private UserProfile(UserProfileBuilder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.phone = builder.phone;
        this.displayName = builder.displayName;
        this.address = builder.address;
        this.marketingOptIn = builder.marketingOptIn;
        this.twitter = builder.twitter;
        this.github = builder.github;
    }
}
