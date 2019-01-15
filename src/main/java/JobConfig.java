import com.mongodb.DBObject;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.MongoItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@EnableBatchProcessing
public class JobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MongoItemReader<Person> itemReader = new MongoItemReader<Person>();

    @Autowired
    private MongoOperations template;


    @Bean
    public Job mongoToJSONToXml() {
        return jobBuilderFactory.get("mongoToJSONToXml")
                .start(step1())
                .next(step2())

                .build();
    }

    private Step step1() {
        return this.stepBuilderFactory.get("step1").< DBObject,Person>chunk(2)
                .reader(ItemReader<DBObject> extends)
                .processor(personProcessor())
                .writer(personWriter())
                .build();
    }

    private ItemProcessor<? super DBObject, ? extends Person> personProcessor() {
        return null;
    }

    private ItemWriter<? super Person> personWriter() {
    }



    private Step step2() {
    }
}
