package kr.ac.hansung.cse.service;

import kr.ac.hansung.cse.dao.OfferDao;
import kr.ac.hansung.cse.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {
    // service -> dao 호출

    @Autowired
    private OfferDao offerDao;

    //table의 모든 레코드 가져오기
    public List<Offer> getAllOffers() {
        return offerDao.getOffers();
    }

    //table에 레코드 추가하기
    public void insert(Offer offer) {
        offerDao.insert(offer);
    }
}
