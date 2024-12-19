package com.revature.socialnetwork.entity;

import java.util.Date;

import jakarta.persistence.*;

/**
 * This class models a friend relationship between users
 */
@Entity
@Table(name = "Friends")
public class Friend {

    /**
     * An id for this friend relationship
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * The id of the user who initiated the friend request
     */
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    /**
     * The id of the user who is being requested as a friend
     */
    @Column(name = "friend_id", nullable = false)
    private Integer friendId;

    /**
     * The status of the friend request
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private FriendStatus status;

    /**
     * The date when this friend relationship was created
     */
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    /**
     * No-args constructor
     */
    public Friend() {
        this.createdAt = new Date();
    }

    /**
     * All-args constructor
     * 
     * @param userId   the id of the user who initiated the friend request
     * @param friendId the id of the user who is being requested as a friend
     * @param status   the status of the friend request
     */
    public Friend(Integer userId, Integer friendId, FriendStatus status) {
        this.userId = userId;
        this.friendId = friendId;
        this.status = status;
        this.createdAt = new Date();
    }

    /**
     * Gets the id of the friend relationship
     * 
     * @return the id of the friend relationship
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id of the friend relationship
     * 
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the id of the user who initiated the friend request
     * 
     * @return the user id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the id of the user who initiated the friend request
     * 
     * @param userId the user id to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Gets the id of the user who is being requested as a friend
     * 
     * @return the friend id
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * Sets the id of the user who is being requested as a friend
     * 
     * @param friendId the friend id to set
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    /**
     * Gets the status of the friend request
     * 
     * @return the status of the friend request
     */
    public FriendStatus getStatus() {
        return status;
    }

    /**
     * Sets the status of the friend request
     * 
     * @param status the status to set
     */
    public void setStatus(FriendStatus status) {
        this.status = status;
    }

    /**
     * Gets the date when the friend relationship was created
     * 
     * @return the creation date
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the date when the friend relationship was created
     * 
     * @param createdAt the creation date to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}