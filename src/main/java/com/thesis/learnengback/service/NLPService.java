package com.thesis.learnengback.service;

import com.thesis.learnengback.config.Pipeline;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NLPService {

    public String getPoS(String text){

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String pos = null;
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabelList){
            pos = coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
        }

        return pos;
    }


    public List<String> getLemma(String[] text){

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String input = String.join(" ", text);
        List<String> lem = new ArrayList<>();

        CoreDocument coreDocument = new CoreDocument(input);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabelList){
            lem.add(coreLabel.lemma());
        }

        return lem;
    }
}
