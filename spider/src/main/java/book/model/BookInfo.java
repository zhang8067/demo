package book.model;

/**
 * @Author zhangzhen
 * @Date 2020/12/15 14:49
 **/
public class BookInfo {



        private String name;

        private String author;

        private String publisher; //出版社

        private String publishTime; //出版时间

        private double rating; //豆瓣评分

        public BookInfo() {
        }

        public BookInfo(String name, String author, String publisher, String publishTime, double rating) {
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.publishTime = publishTime;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "BookInfo{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", publishTime='" + publishTime + '\'' +
                    ", rating=" + rating +
                    '}';
        }
    }

