package com.example.drplant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DiagnosisActivity extends AppCompatActivity {
    TextView Name,Remedy;
    String classificationResult,diagnosis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);
        Name=(TextView)findViewById(R.id.Name);
        Remedy=(TextView)findViewById(R.id.Remedy);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            classificationResult= bundle.getString("name");
            switch (classificationResult)
            {
                case "Tomato Septoria Leaf Spot": diagnosis="Treating septoria leaf spot disease after it appears is achieved with fungicides. The chemicals need to be applied on a seven- to ten-day schedule to be effective. \n" +
                                                            "•\tMonterey Liqui-Cop Fungicide\n" +
                                                            "•\tSouthern Ag Liquid Copper Fungicide\n" +
                                                            "•\tBonide Copper 4E Fungicide\n" +
                                                            "•\tSerenade Garden Disease Control\n" +
                                                            "•\tDaconil Fungicide Concentrate\n" +
                                                            "•\tBonide Mancozeb Fungal Disease Control\n";
                                                    break;
                case "Tomato Bacterial Spot ": diagnosis="If purchasing disease-free tomato seeds is not an option, " +
                                                        "it is important to try to sterilize the seeds as best you can, " +
                                                        "eliminating any bacteria that may exist on the seed’s surface and interior. " +
                                                        "To do this, fully submerge your tomato seeds in 1.3% sodium hypochlorite for " +
                                                        "one minute. A slightly more risky technique exists which could affect germination " +
                                                        "but helps to sterilize both the outer surface and interior of the tomato seed by submerging the seeds in 122 " +
                                                        "degree F water for 25 minutes.";
                                                    break;

                case "Tomato Blight": diagnosis="Once blight is positively identified," +
                                                "act quickly to prevent it from spreading. " +
                                                "Remove all affected leaves and burn them or place them in the garbage. " +
                                                "Mulch around the base of the plant with straw, wood chips or other natural mulch" +
                                                " to prevent fungal spores in the soil from splashing on the plant. " +
                                                "If blight has already spread to more than just a few plant leaves, apply Daconil® " +
                                                "Fungicide Ready-To-Use, which kills fungal spores and keeps blight from causing further damage.";
                                                 break;


                case "Tomato Spider Mite" : diagnosis="When spraying ensure underside of leaf is covered by the chemical.\n" +
                                            "•\tUse fungicides with sulphur, since they reduce populations of mites.\n" +
                                             "•\tYou can also use miticides which are specific for mites e.g. Dynamec (active ingredient abamectin), Oberon (spiromesifen) or Omite (propargite).\n" ;
                                                break;

                case "Tomato Leaf Mold": diagnosis="Use drip irrigation and avoid watering foliage. " +
                                                    "Use a stake, strings, or prune the plant to keep it upstanding and increase airflow in and around it. " +
                                                    "Remove and destroy (burn) all plants debris after the harvest.";
                                                break;

                case "Tomato Yellow Leaf Curl Virus": diagnosis="Use a neonicotinoid insecticide, such as dinotefuran (Venom) imidacloprid (AdmirePro, Alias, Nuprid, Widow, and others) or " +
                                                                "thiamethoxam (Platinum), as a soil application or through the drip irrigation system at transplanting of tomatoes.";
                                                        break;


                case "Soy Frogeye Leaf Spot": diagnosis="To manage frogeye leaf spot, use resistant soybean varieties and pathogen-free seed. " +
                                                        "Rotate soybeans with a non-bean crop. Bury infested residue where feasible and where disease" +
                                                        " is severe. Foliar and seed treatment fungicides may provide some control.";

                                                        break;

                case "Soy Downy Mildew": diagnosis="Select resistant soybean varieties and use appropriate seed treatments. " +
                                                    "Bury infested residue where feasible and where disease has been severe. " +
                                                    "Rotate soybeans with a non-bean crop for at least one year.";

                                                    break;

                case "Maize Ravi Corn Rust": diagnosis="Maize rusts are generally controlled by the use of resistant maize hybrids, " +
                                                        "and by foliar applications of fungicides on sweet corn. " +
                                                        "Cultural practices may be effective in areas where rust spores can overwinter on " +
                                                        "debris or where infected Oxalis species are a source of spores.";

                                                    break;

                case "Maize Grey Leaf Spot": diagnosis="Management techniques include crop resistance, crop rotation, residue management, " +
                                                        "use of fungicides, and weed control. The purpose of disease management is to prevent " +
                                                        "the amount of secondary disease cycles as well as to protect leaf area from damage.";

                                                    break;


                case "Maize Lethal Necrosis": diagnosis="The best approach for the management is to employ integrated pest management practices " +
                                                        "encompassing cultural control such as closed season, crop rotation and crop diversification, " +
                                                        "vector control using seed treatment followed by foliar sprays, and host-plant resistance.";

                                                break;

                case "Cabbage Black Rot": diagnosis="Hot water treatment can be used to destroy the bacteria that may be infesting your seed. " +
                                                    "If you have purchased seed that has NOT been hot water treated, you can treat the seed yourself, " +
                                                    "but it is critical to do it correctly. For cabbage, soak seed for 25 minutes in 122°F water.";

                                                    break;

                default: diagnosis="Not Applicable";
            }
            Name.setText(classificationResult);
            Remedy.setText(diagnosis);
        }
    }
}