package com.neihan.alex.myneihanduanzi.bean;

import java.util.List;

/**
 * Created by Alex on 2017/6/19.
 * Alex
 */

public class NeiHanImgsBean {

    private GroupBean group;

    private long type;
    private double display_time;
    private double online_time;

    private List<CommentsBean> comments;

    public GroupBean getGroup() {
        return group;
    }

    public void setGroup(GroupBean group) {
        this.group = group;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public double getDisplay_time() {
        return display_time;
    }

    public void setDisplay_time(double display_time) {
        this.display_time = display_time;
    }

    public double getOnline_time() {
        return online_time;
    }

    public void setOnline_time(double online_time) {
        this.online_time = online_time;
    }

    public List<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBean> comments) {
        this.comments = comments;
    }

    public static class GroupBean {
        /**
         * user_id : 61605990061
         * name : -西瓜甜吗
         * followings : 0
         * user_verified : false
         * ugc_count : 32
         * avatar_url : http://p3.pstatp.com/medium/249b00113c4a5825b828
         * followers : 28
         * is_following : false
         * is_pro_user : false
         */

        private UserBean user;
        private String text;
        private String neihan_hot_start_time;
        private long create_time;
        private long id;
        private long favorite_count;
        private long go_detail_count;
        private long user_favorite;
        private long share_type;
        private double max_screen_width_percent;
        private long is_can_share;
        private long category_type;
        private String share_url;
        private long label;
        private String content;
        private long comment_count;
        private String id_str;
        private long media_type;
        private long share_count;
        private long type;
        private long status;
        private long has_comments;
        /**
         * width : 240
         * r_height : 240
         * r_width : 240
         * url_list : [{"url":"http://p3.pstatp.com/large/2866000162df8a7bd9c3"},{"url":"http://pb9.pstatp.com/large/2866000162df8a7bd9c3"},{"url":"http://pb1.pstatp.com/large/2866000162df8a7bd9c3"}]
         * uri : large/2866000162df8a7bd9c3
         * height : 240
         */

        private LargeImageBean large_image;
        private long user_bury;
        private String status_desc;
        private boolean quick_comment;
        private long display_type;
        private String neihan_hot_end_time;
        private long user_digg;
        private long online_time;
        private String category_name;
        private boolean category_visible;
        private long bury_count;
        private boolean is_anonymous;
        private long repin_count;
        private double min_screen_width_percent;
        private boolean is_neihan_hot;
        private long digg_count;
        private long is_gif;
        private long has_hot_comments;
        private boolean allow_dislike;
        private long image_status;
        private long user_repin;
        private int is_multi_image;
        private long group_id;
        private MiddleImageBean middle_image;
        private long category_id;
        private List<DislikeReasonBean> dislike_reason;
        private List<LargeImageListBean> large_image_list;
        private List<ThumbImageListBean> thumb_image_list;

        public boolean is_anonymous() {
            return is_anonymous;
        }

        public boolean is_neihan_hot() {
            return is_neihan_hot;
        }

        public int getIs_multi_image() {
            return is_multi_image;
        }

        public void setIs_multi_image(int is_multi_image) {
            this.is_multi_image = is_multi_image;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public List<LargeImageListBean> getLarge_image_list() {
            return large_image_list;
        }

        public void setLarge_image_list(List<LargeImageListBean> large_image_list) {
            this.large_image_list = large_image_list;
        }

        public List<ThumbImageListBean> getThumb_image_list() {
            return thumb_image_list;
        }

        public void setThumb_image_list(List<ThumbImageListBean> thumb_image_list) {
            this.thumb_image_list = thumb_image_list;
        }

        public String getNeihan_hot_start_time() {
            return neihan_hot_start_time;
        }

        public void setNeihan_hot_start_time(String neihan_hot_start_time) {
            this.neihan_hot_start_time = neihan_hot_start_time;
        }

        public long getCreate_time() {
            return create_time;
        }

        public void setCreate_time(long create_time) {
            this.create_time = create_time;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getFavorite_count() {
            return favorite_count;
        }

        public void setFavorite_count(long favorite_count) {
            this.favorite_count = favorite_count;
        }

        public long getGo_detail_count() {
            return go_detail_count;
        }

        public void setGo_detail_count(long go_detail_count) {
            this.go_detail_count = go_detail_count;
        }

        public long getUser_favorite() {
            return user_favorite;
        }

        public void setUser_favorite(long user_favorite) {
            this.user_favorite = user_favorite;
        }

        public long getShare_type() {
            return share_type;
        }

        public void setShare_type(long share_type) {
            this.share_type = share_type;
        }

        public double getMax_screen_width_percent() {
            return max_screen_width_percent;
        }

        public void setMax_screen_width_percent(double max_screen_width_percent) {
            this.max_screen_width_percent = max_screen_width_percent;
        }

        public long getIs_can_share() {
            return is_can_share;
        }

        public void setIs_can_share(long is_can_share) {
            this.is_can_share = is_can_share;
        }

        public long getCategory_type() {
            return category_type;
        }

        public void setCategory_type(long category_type) {
            this.category_type = category_type;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public long getLabel() {
            return label;
        }

        public void setLabel(long label) {
            this.label = label;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getComment_count() {
            return comment_count;
        }

        public void setComment_count(long comment_count) {
            this.comment_count = comment_count;
        }

        public String getId_str() {
            return id_str;
        }

        public void setId_str(String id_str) {
            this.id_str = id_str;
        }

        public long getMedia_type() {
            return media_type;
        }

        public void setMedia_type(long media_type) {
            this.media_type = media_type;
        }

        public long getShare_count() {
            return share_count;
        }

        public void setShare_count(long share_count) {
            this.share_count = share_count;
        }

        public long getType() {
            return type;
        }

        public void setType(long type) {
            this.type = type;
        }

        public long getStatus() {
            return status;
        }

        public void setStatus(long status) {
            this.status = status;
        }

        public long getHas_comments() {
            return has_comments;
        }

        public void setHas_comments(long has_comments) {
            this.has_comments = has_comments;
        }

        public LargeImageBean getLarge_image() {
            return large_image;
        }

        public void setLarge_image(LargeImageBean large_image) {
            this.large_image = large_image;
        }

        public long getUser_bury() {
            return user_bury;
        }

        public void setUser_bury(long user_bury) {
            this.user_bury = user_bury;
        }

        public String getStatus_desc() {
            return status_desc;
        }

        public void setStatus_desc(String status_desc) {
            this.status_desc = status_desc;
        }

        public boolean isQuick_comment() {
            return quick_comment;
        }

        public void setQuick_comment(boolean quick_comment) {
            this.quick_comment = quick_comment;
        }

        public long getDisplay_type() {
            return display_type;
        }

        public void setDisplay_type(long display_type) {
            this.display_type = display_type;
        }

        public String getNeihan_hot_end_time() {
            return neihan_hot_end_time;
        }

        public void setNeihan_hot_end_time(String neihan_hot_end_time) {
            this.neihan_hot_end_time = neihan_hot_end_time;
        }

        public long getUser_digg() {
            return user_digg;
        }

        public void setUser_digg(long user_digg) {
            this.user_digg = user_digg;
        }

        public long getOnline_time() {
            return online_time;
        }

        public void setOnline_time(long online_time) {
            this.online_time = online_time;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public boolean isCategory_visible() {
            return category_visible;
        }

        public void setCategory_visible(boolean category_visible) {
            this.category_visible = category_visible;
        }

        public long getBury_count() {
            return bury_count;
        }

        public void setBury_count(long bury_count) {
            this.bury_count = bury_count;
        }

        public boolean isIs_anonymous() {
            return is_anonymous;
        }

        public void setIs_anonymous(boolean is_anonymous) {
            this.is_anonymous = is_anonymous;
        }

        public long getRepin_count() {
            return repin_count;
        }

        public void setRepin_count(long repin_count) {
            this.repin_count = repin_count;
        }

        public double getMin_screen_width_percent() {
            return min_screen_width_percent;
        }

        public void setMin_screen_width_percent(double min_screen_width_percent) {
            this.min_screen_width_percent = min_screen_width_percent;
        }

        public boolean isIs_neihan_hot() {
            return is_neihan_hot;
        }

        public void setIs_neihan_hot(boolean is_neihan_hot) {
            this.is_neihan_hot = is_neihan_hot;
        }

        public long getDigg_count() {
            return digg_count;
        }

        public void setDigg_count(long digg_count) {
            this.digg_count = digg_count;
        }

        public long getIs_gif() {
            return is_gif;
        }

        public void setIs_gif(long is_gif) {
            this.is_gif = is_gif;
        }

        public long getHas_hot_comments() {
            return has_hot_comments;
        }

        public void setHas_hot_comments(long has_hot_comments) {
            this.has_hot_comments = has_hot_comments;
        }

        public boolean isAllow_dislike() {
            return allow_dislike;
        }

        public void setAllow_dislike(boolean allow_dislike) {
            this.allow_dislike = allow_dislike;
        }

        public long getImage_status() {
            return image_status;
        }

        public void setImage_status(long image_status) {
            this.image_status = image_status;
        }

        public long getUser_repin() {
            return user_repin;
        }

        public void setUser_repin(long user_repin) {
            this.user_repin = user_repin;
        }

        public long getGroup_id() {
            return group_id;
        }

        public void setGroup_id(long group_id) {
            this.group_id = group_id;
        }

        public MiddleImageBean getMiddle_image() {
            return middle_image;
        }

        public void setMiddle_image(MiddleImageBean middle_image) {
            this.middle_image = middle_image;
        }

        public long getCategory_id() {
            return category_id;
        }

        public void setCategory_id(long category_id) {
            this.category_id = category_id;
        }

        public List<DislikeReasonBean> getDislike_reason() {
            return dislike_reason;
        }

        public void setDislike_reason(List<DislikeReasonBean> dislike_reason) {
            this.dislike_reason = dislike_reason;
        }

        public static class LargeImageListBean {
            private String url;
            private String uri;
            private int height;
            private int width;
            private boolean is_gif;
            /**
             * url : http://p3.pstatp.com/large/22e3000528652d349e82.webp
             */

            private List<UrlListBean> url_list;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public boolean isIs_gif() {
                return is_gif;
            }

            public void setIs_gif(boolean is_gif) {
                this.is_gif = is_gif;
            }

            public List<UrlListBean> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBean> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBean {
                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class ThumbImageListBean {
            private String url;
            private String uri;
            private int height;
            private int width;
            private boolean is_gif;
            /**
             * url : http://p3.pstatp.com/list/s270/22e3000528652d349e82.webp
             */

            private List<UrlListBean> url_list;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public boolean isIs_gif() {
                return is_gif;
            }

            public void setIs_gif(boolean is_gif) {
                this.is_gif = is_gif;
            }

            public List<UrlListBean> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBean> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBean {
                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class UserBean {
            private long user_id;
            private String name;
            private long followings;
            private boolean user_verified;
            private long ugc_count;
            private String avatar_url;
            private long followers;
            private boolean is_following;
            private boolean is_pro_user;

            public long getUser_id() {
                return user_id;
            }

            public void setUser_id(long user_id) {
                this.user_id = user_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getFollowings() {
                return followings;
            }

            public void setFollowings(long followings) {
                this.followings = followings;
            }

            public boolean isUser_verified() {
                return user_verified;
            }

            public void setUser_verified(boolean user_verified) {
                this.user_verified = user_verified;
            }

            public long getUgc_count() {
                return ugc_count;
            }

            public void setUgc_count(long ugc_count) {
                this.ugc_count = ugc_count;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public long getFollowers() {
                return followers;
            }

            public void setFollowers(long followers) {
                this.followers = followers;
            }

            public boolean isIs_following() {
                return is_following;
            }

            public void setIs_following(boolean is_following) {
                this.is_following = is_following;
            }

            public boolean isIs_pro_user() {
                return is_pro_user;
            }

            public void setIs_pro_user(boolean is_pro_user) {
                this.is_pro_user = is_pro_user;
            }
        }

        public static class LargeImageBean {
            private long width;
            private long r_height;
            private long r_width;
            private String uri;
            private long height;
            /**
             * url : http://p3.pstatp.com/large/2866000162df8a7bd9c3
             */

            private List<UrlListBean> url_list;

            public long getWidth() {
                return width;
            }

            public void setWidth(long width) {
                this.width = width;
            }

            public long getR_height() {
                return r_height;
            }

            public void setR_height(long r_height) {
                this.r_height = r_height;
            }

            public long getR_width() {
                return r_width;
            }

            public void setR_width(long r_width) {
                this.r_width = r_width;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public long getHeight() {
                return height;
            }

            public void setHeight(long height) {
                this.height = height;
            }

            public List<UrlListBean> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBean> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBean {
                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class MiddleImageBean {
            private long width;
            private long r_height;
            private long r_width;
            private String uri;
            private long height;
            /**
             * url : http://p3.pstatp.com/w240/2866000162df8a7bd9c3.webp
             */

            private List<UrlListBean> url_list;

            public long getWidth() {
                return width;
            }

            public void setWidth(long width) {
                this.width = width;
            }

            public long getR_height() {
                return r_height;
            }

            public void setR_height(long r_height) {
                this.r_height = r_height;
            }

            public long getR_width() {
                return r_width;
            }

            public void setR_width(long r_width) {
                this.r_width = r_width;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public long getHeight() {
                return height;
            }

            public void setHeight(long height) {
                this.height = height;
            }

            public List<UrlListBean> getUrl_list() {
                return url_list;
            }

            public void setUrl_list(List<UrlListBean> url_list) {
                this.url_list = url_list;
            }

            public static class UrlListBean {
                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class DislikeReasonBean {
            private long type;
            private long id;
            private String title;

            public long getType() {
                return type;
            }

            public void setType(long type) {
                this.type = type;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }

    public static class CommentsBean {
        private String text;
        private long create_time;
        private boolean user_verified;
        private long user_bury;
        private long user_id;
        private long bury_count;
        private String share_url;
        private long id;
        private String platform;
        private long is_digg;
        private String user_name;
        private String user_profile_image_url;
        private long status;
        private String description;
        private long user_digg;
        private String user_profile_url;
        private long share_type;
        private long digg_count;
        private boolean is_pro_user;
        private String platform_id;
        private String avatar_url;
        private long group_id;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public long getCreate_time() {
            return create_time;
        }

        public void setCreate_time(long create_time) {
            this.create_time = create_time;
        }

        public boolean isUser_verified() {
            return user_verified;
        }

        public void setUser_verified(boolean user_verified) {
            this.user_verified = user_verified;
        }

        public long getUser_bury() {
            return user_bury;
        }

        public void setUser_bury(long user_bury) {
            this.user_bury = user_bury;
        }

        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public long getBury_count() {
            return bury_count;
        }

        public void setBury_count(long bury_count) {
            this.bury_count = bury_count;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public long getIs_digg() {
            return is_digg;
        }

        public void setIs_digg(long is_digg) {
            this.is_digg = is_digg;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getUser_profile_image_url() {
            return user_profile_image_url;
        }

        public void setUser_profile_image_url(String user_profile_image_url) {
            this.user_profile_image_url = user_profile_image_url;
        }

        public long getStatus() {
            return status;
        }

        public void setStatus(long status) {
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public long getUser_digg() {
            return user_digg;
        }

        public void setUser_digg(long user_digg) {
            this.user_digg = user_digg;
        }

        public String getUser_profile_url() {
            return user_profile_url;
        }

        public void setUser_profile_url(String user_profile_url) {
            this.user_profile_url = user_profile_url;
        }

        public long getShare_type() {
            return share_type;
        }

        public void setShare_type(long share_type) {
            this.share_type = share_type;
        }

        public long getDigg_count() {
            return digg_count;
        }

        public void setDigg_count(long digg_count) {
            this.digg_count = digg_count;
        }

        public boolean isIs_pro_user() {
            return is_pro_user;
        }

        public void setIs_pro_user(boolean is_pro_user) {
            this.is_pro_user = is_pro_user;
        }

        public String getPlatform_id() {
            return platform_id;
        }

        public void setPlatform_id(String platform_id) {
            this.platform_id = platform_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public long getGroup_id() {
            return group_id;
        }

        public void setGroup_id(long group_id) {
            this.group_id = group_id;
        }
    }
}
