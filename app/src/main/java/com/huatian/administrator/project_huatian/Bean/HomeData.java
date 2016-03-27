package com.huatian.administrator.project_huatian.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * @描述：
 * @创建人： 杰
 * @创建时间: 2016/3/27 13:58
 * @备注：
 */
public class HomeData {

    /**
     * msg : 已获取文章列表
     * result : [{"appoint":326,"author":{"adminId":"e21b49be-f133-4353-9128-2f1f65f5269e","createDate":"","email":"","isLock":0,"password":"","realName":"","userName":"dasheng","userType":0},"category":{"createDate":"","id":"8e665b7f-2bf5-466e-993b-feca8f39db56","name":"跨界鉴赏","order":0},"check":true,"content":"","content2":"","content3":"","contentTitle1":"","contentTitle2":"","contentTitle3":"","createDate":"2016-01-13 14:27:51.0","desc":"清新素淡的襟花象征一种尊贵的礼节，让原本严谨正统的套装焕发出迷人的光彩. 不同形态的花朵编织成束，轻微的花香时不时地拂面而至，让一天的心情也跟着欢心雀跃起来.","descIcon":"","favo":521,"hasAddFavo":false,"hasAppoint":false,"id":"e402cd59-186d-46f3-89a2-09b8495057ae","keywords":"胸花，襟花，剁肉植物，婚礼","newAppoint":0,"newFavo":0,"newRead":0,"order":95,"pageUrl":"http://app.htxq.net//servlet/SysArticleServlet?action=preview&artId=e402cd59-186d-46f3-89a2-09b8495057ae","pass":1,"pushTime":"","read":11645,"share":49,"sharePageUrl":"http://app.htxq.net//servlet/SysArticleServlet?action=sharePreview&artId=e402cd59-186d-46f3-89a2-09b8495057ae","smallIcon":"http://htxq.oss-cn-beijing.aliyuncs.com/UploadFiles/2016/01/10/20160110175341097070.jpg","title":"如何正确搭配襟花","top":false,"video":false,"videoUrl":""}]
     * status : true
     */

    private String msg;
    private boolean status;
    /**
     * appoint : 326
     * author : {"adminId":"e21b49be-f133-4353-9128-2f1f65f5269e","createDate":"","email":"","isLock":0,"password":"","realName":"","userName":"dasheng","userType":0}
     * category : {"createDate":"","id":"8e665b7f-2bf5-466e-993b-feca8f39db56","name":"跨界鉴赏","order":0}
     * check : true
     * content :
     * content2 :
     * content3 :
     * contentTitle1 :
     * contentTitle2 :
     * contentTitle3 :
     * createDate : 2016-01-13 14:27:51.0
     * desc : 清新素淡的襟花象征一种尊贵的礼节，让原本严谨正统的套装焕发出迷人的光彩. 不同形态的花朵编织成束，轻微的花香时不时地拂面而至，让一天的心情也跟着欢心雀跃起来.
     * descIcon :
     * favo : 521
     * hasAddFavo : false
     * hasAppoint : false
     * id : e402cd59-186d-46f3-89a2-09b8495057ae
     * keywords : 胸花，襟花，剁肉植物，婚礼
     * newAppoint : 0
     * newFavo : 0
     * newRead : 0
     * order : 95
     * pageUrl : http://app.htxq.net//servlet/SysArticleServlet?action=preview&artId=e402cd59-186d-46f3-89a2-09b8495057ae
     * pass : 1
     * pushTime :
     * read : 11645
     * share : 49
     * sharePageUrl : http://app.htxq.net//servlet/SysArticleServlet?action=sharePreview&artId=e402cd59-186d-46f3-89a2-09b8495057ae
     * smallIcon : http://htxq.oss-cn-beijing.aliyuncs.com/UploadFiles/2016/01/10/20160110175341097070.jpg
     * title : 如何正确搭配襟花
     * top : false
     * video : false
     * videoUrl :
     */

    private List<ResultEntity> result;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isStatus() {
        return status;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public static class ResultEntity implements Serializable{
        private int appoint;
        /**
         * adminId : e21b49be-f133-4353-9128-2f1f65f5269e
         * createDate :
         * email :
         * isLock : 0
         * password :
         * realName :
         * userName : dasheng
         * userType : 0
         */

        private AuthorEntity author;
        /**
         * createDate :
         * id : 8e665b7f-2bf5-466e-993b-feca8f39db56
         * name : 跨界鉴赏
         * order : 0
         */

        private CategoryEntity category;
        private boolean check;
        private String content;
        private String content2;
        private String content3;
        private String contentTitle1;
        private String contentTitle2;
        private String contentTitle3;
        private String createDate;
        private String desc;
        private String descIcon;
        private int favo;
        private boolean hasAddFavo;
        private boolean hasAppoint;
        private String id;
        private String keywords;
        private int newAppoint;
        private int newFavo;
        private int newRead;
        private int order;
        private String pageUrl;
        private int pass;
        private String pushTime;
        private int read;
        private int share;
        private String sharePageUrl;
        private String smallIcon;
        private String title;
        private boolean top;
        private boolean video;
        private String videoUrl;

        public void setAppoint(int appoint) {
            this.appoint = appoint;
        }

        public void setAuthor(AuthorEntity author) {
            this.author = author;
        }

        public void setCategory(CategoryEntity category) {
            this.category = category;
        }

        public void setCheck(boolean check) {
            this.check = check;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setContent2(String content2) {
            this.content2 = content2;
        }

        public void setContent3(String content3) {
            this.content3 = content3;
        }

        public void setContentTitle1(String contentTitle1) {
            this.contentTitle1 = contentTitle1;
        }

        public void setContentTitle2(String contentTitle2) {
            this.contentTitle2 = contentTitle2;
        }

        public void setContentTitle3(String contentTitle3) {
            this.contentTitle3 = contentTitle3;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setDescIcon(String descIcon) {
            this.descIcon = descIcon;
        }

        public void setFavo(int favo) {
            this.favo = favo;
        }

        public void setHasAddFavo(boolean hasAddFavo) {
            this.hasAddFavo = hasAddFavo;
        }

        public void setHasAppoint(boolean hasAppoint) {
            this.hasAppoint = hasAppoint;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public void setNewAppoint(int newAppoint) {
            this.newAppoint = newAppoint;
        }

        public void setNewFavo(int newFavo) {
            this.newFavo = newFavo;
        }

        public void setNewRead(int newRead) {
            this.newRead = newRead;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public void setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
        }

        public void setPass(int pass) {
            this.pass = pass;
        }

        public void setPushTime(String pushTime) {
            this.pushTime = pushTime;
        }

        public void setRead(int read) {
            this.read = read;
        }

        public void setShare(int share) {
            this.share = share;
        }

        public void setSharePageUrl(String sharePageUrl) {
            this.sharePageUrl = sharePageUrl;
        }

        public void setSmallIcon(String smallIcon) {
            this.smallIcon = smallIcon;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setTop(boolean top) {
            this.top = top;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public int getAppoint() {
            return appoint;
        }

        public AuthorEntity getAuthor() {
            return author;
        }

        public CategoryEntity getCategory() {
            return category;
        }

        public boolean isCheck() {
            return check;
        }

        public String getContent() {
            return content;
        }

        public String getContent2() {
            return content2;
        }

        public String getContent3() {
            return content3;
        }

        public String getContentTitle1() {
            return contentTitle1;
        }

        public String getContentTitle2() {
            return contentTitle2;
        }

        public String getContentTitle3() {
            return contentTitle3;
        }

        public String getCreateDate() {
            return createDate;
        }

        public String getDesc() {
            return desc;
        }

        public String getDescIcon() {
            return descIcon;
        }

        public int getFavo() {
            return favo;
        }

        public boolean isHasAddFavo() {
            return hasAddFavo;
        }

        public boolean isHasAppoint() {
            return hasAppoint;
        }

        public String getId() {
            return id;
        }

        public String getKeywords() {
            return keywords;
        }

        public int getNewAppoint() {
            return newAppoint;
        }

        public int getNewFavo() {
            return newFavo;
        }

        public int getNewRead() {
            return newRead;
        }

        public int getOrder() {
            return order;
        }

        public String getPageUrl() {
            return pageUrl;
        }

        public int getPass() {
            return pass;
        }

        public String getPushTime() {
            return pushTime;
        }

        public int getRead() {
            return read;
        }

        public int getShare() {
            return share;
        }

        public String getSharePageUrl() {
            return sharePageUrl;
        }

        public String getSmallIcon() {
            return smallIcon;
        }

        public String getTitle() {
            return title;
        }

        public boolean isTop() {
            return top;
        }

        public boolean isVideo() {
            return video;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public static class AuthorEntity {
            private String adminId;
            private String createDate;
            private String email;
            private int isLock;
            private String password;
            private String realName;
            private String userName;
            private int userType;

            public void setAdminId(String adminId) {
                this.adminId = adminId;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setIsLock(int isLock) {
                this.isLock = isLock;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public String getAdminId() {
                return adminId;
            }

            public String getCreateDate() {
                return createDate;
            }

            public String getEmail() {
                return email;
            }

            public int getIsLock() {
                return isLock;
            }

            public String getPassword() {
                return password;
            }

            public String getRealName() {
                return realName;
            }

            public String getUserName() {
                return userName;
            }

            public int getUserType() {
                return userType;
            }
        }

        public static class CategoryEntity {
            private String createDate;
            private String id;
            private String name;
            private int order;

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }

            public void setId(String id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public String getCreateDate() {
                return createDate;
            }

            public String getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public int getOrder() {
                return order;
            }
        }
    }
}
