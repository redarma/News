package org.rest.news;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement
class News {

    private int    newsid;
    private String title;
    private String description;
    private String text;
    private String category;
    private Date   createdate;
    
    News() {

    }

    /**
     * @return the newsid
     */
    @XmlElement
    public int getNewsid() {
        return newsid;
    }

    /**
     * @param newsid
     *            the newsid to set
     */
    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    /**
     * @return the title
     */
    @XmlElement
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    @XmlElement
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the text
     */
    @XmlElement
    public String getText() {
        return text;
    }

    /**
     * @param text
     *            the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the category
     */
    @XmlElement
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     *            the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the createdate
     */
    @XmlElement
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     *            the createdate to set
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

	@Override
	public String toString() {
		return "News [newsid=" + newsid + ", title=" + title + ", description="
				+ description + ", text=" + text + ", category=" + category
				+ ", createdate=" + createdate + "]";
	}

}
