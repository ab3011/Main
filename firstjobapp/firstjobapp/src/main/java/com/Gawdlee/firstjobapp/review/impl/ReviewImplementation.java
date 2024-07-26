package com.Gawdlee.firstjobapp.review.impl;

import com.Gawdlee.firstjobapp.review.Review;
import com.Gawdlee.firstjobapp.review.ReviewRepository;
import com.Gawdlee.firstjobapp.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewImplementation implements ReviewService {
    private ReviewRepository reviewRepository;

    public ReviewImplementation(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }
}
