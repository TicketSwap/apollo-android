package com.example.fragments_with_type_condition;

import com.apollographql.android.api.graphql.Operation;
import com.apollographql.android.api.graphql.Query;
import com.example.fragments_with_type_condition.fragment.DroidDetails;
import com.example.fragments_with_type_condition.fragment.HumanDetails;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class TestQuery implements Query<Operation.Variables> {
  public static final String OPERATION_DEFINITION = "query TestQuery {\n"
      + "  r2: hero {\n"
      + "    __typename\n"
      + "    ...HumanDetails\n"
      + "    ...DroidDetails\n"
      + "  }\n"
      + "  luke: hero {\n"
      + "    __typename\n"
      + "    ...HumanDetails\n"
      + "    ...DroidDetails\n"
      + "  }\n"
      + "}";

  public static final String QUERY_DOCUMENT = OPERATION_DEFINITION + "\n"
   + HumanDetails.FRAGMENT_DEFINITION + "\n"
   + DroidDetails.FRAGMENT_DEFINITION;

  private final Operation.Variables variables;

  public TestQuery() {
    this.variables = Operation.EMPTY_VARIABLES;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public Operation.Variables variables() {
    return variables;
  }

  public interface Data extends Operation.Data {
    @Nullable R2 r2();

    @Nullable Luke luke();

    interface R2 {
      Fragments fragments();

      interface Fragments {
        HumanDetails humanDetails();

        DroidDetails droidDetails();

        interface Factory {
          Creator creator();
        }

        interface Creator {
          Fragments create(HumanDetails humanDetails, DroidDetails droidDetails);
        }
      }

      interface Factory {
        Creator creator();

        Fragments.Factory fragmentsFactory();
      }

      interface Creator {
        R2 create(Fragments fragments);
      }
    }

    interface Luke {
      Fragments fragments();

      interface Fragments {
        HumanDetails humanDetails();

        DroidDetails droidDetails();

        interface Factory {
          Creator creator();
        }

        interface Creator {
          Fragments create(HumanDetails humanDetails, DroidDetails droidDetails);
        }
      }

      interface Factory {
        Creator creator();

        Fragments.Factory fragmentsFactory();
      }

      interface Creator {
        Luke create(Fragments fragments);
      }
    }

    interface Factory {
      Creator creator();

      R2.Factory r2Factory();

      Luke.Factory lukeFactory();
    }

    interface Creator {
      Data create(@Nullable R2 r2, @Nullable Luke luke);
    }
  }
}
