package cmd.vardhan.client.service;

import cmd.vardhan.client.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {

    NounClient nounClient;
    AdjectiveClient adjectiveClient;
    ArticleCleint articleCleint;
    SubjectClient subjectClient;
    VerbClient verbClient;

    @Autowired
    public SentenceServiceImpl(NounClient nounClient, AdjectiveClient adjectiveClient, ArticleCleint articleCleint, SubjectClient subjectClient, VerbClient verbClient) {
        this.nounClient = nounClient;
        this.adjectiveClient = adjectiveClient;
        this.articleCleint = articleCleint;
        this.subjectClient = subjectClient;
        this.verbClient = verbClient;
    }

    @Override
    public String buildSentence() {
        return
                subjectClient.getWord()+" "+verbClient.getWord()+" "
                +articleCleint.getWord()+" "+adjectiveClient.getWord()+" "
                 +nounClient.getWord();
    }

}
