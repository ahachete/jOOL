/**
 * Copyright (c) 2014-2015, Data Geekery GmbH, contact@datageekery.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jooq.lambda.function;


import org.jooq.lambda.tuple.Tuple1;
import org.jooq.lambda.tuple.Tuple2;
import org.jooq.lambda.tuple.Tuple3;
import org.jooq.lambda.tuple.Tuple4;
import org.jooq.lambda.tuple.Tuple5;
import org.jooq.lambda.tuple.Tuple6;
import org.jooq.lambda.tuple.Tuple7;
import org.jooq.lambda.tuple.Tuple8;
import org.jooq.lambda.tuple.Tuple9;
import org.jooq.lambda.tuple.Tuple10;
import org.jooq.lambda.tuple.Tuple11;
import org.jooq.lambda.tuple.Tuple12;
import org.jooq.lambda.tuple.Tuple13;
import org.jooq.lambda.tuple.Tuple14;
import org.jooq.lambda.tuple.Tuple15;
import org.jooq.lambda.tuple.Tuple16;

/**
 * A function with 16 arguments
 *
 * @author Lukas Eder
 */
@FunctionalInterface
public interface Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> {

    /**
     * Apply this function to the arguments.
     *
     * @param args The arguments as a tuple.
     */
    default R apply(Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> args) {
        return apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, args.v11, args.v12, args.v13, args.v14, args.v15, args.v16);
    }

    /**
     * Apply this function to the arguments.
     */
    R apply(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14, T15 v15, T16 v16);

    /**
     * Partially apply this function to the arguments.
     */
    default Function15<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1) {
        return (v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function14<T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2) {
        return (v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function13<T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3) {
        return (v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function12<T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4) {
        return (v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function11<T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5) {
        return (v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function10<T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6) {
        return (v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function9<T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7) {
        return (v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function8<T9, T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8) {
        return (v9, v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function7<T10, T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9) {
        return (v10, v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function6<T11, T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10) {
        return (v11, v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function5<T12, T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11) {
        return (v12, v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function4<T13, T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12) {
        return (v13, v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function3<T14, T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13) {
        return (v14, v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function2<T15, T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14) {
        return (v15, v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function1<T16, R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14, T15 v15) {
        return (v16) -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function0<R> curry(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14, T15 v15, T16 v16) {
        return () -> apply(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function15<T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple1<T1> args) {
        return (v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function14<T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple2<T1, T2> args) {
        return (v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function13<T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple3<T1, T2, T3> args) {
        return (v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function12<T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple4<T1, T2, T3, T4> args) {
        return (v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function11<T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple5<T1, T2, T3, T4, T5> args) {
        return (v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function10<T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple6<T1, T2, T3, T4, T5, T6> args) {
        return (v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function9<T8, T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple7<T1, T2, T3, T4, T5, T6, T7> args) {
        return (v8, v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function8<T9, T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> args) {
        return (v9, v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function7<T10, T11, T12, T13, T14, T15, T16, R> curry(Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> args) {
        return (v10, v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function6<T11, T12, T13, T14, T15, T16, R> curry(Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> args) {
        return (v11, v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function5<T12, T13, T14, T15, T16, R> curry(Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> args) {
        return (v12, v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, args.v11, v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function4<T13, T14, T15, T16, R> curry(Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> args) {
        return (v13, v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, args.v11, args.v12, v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function3<T14, T15, T16, R> curry(Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> args) {
        return (v14, v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, args.v11, args.v12, args.v13, v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function2<T15, T16, R> curry(Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> args) {
        return (v15, v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, args.v11, args.v12, args.v13, args.v14, v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function1<T16, R> curry(Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> args) {
        return (v16) -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, args.v11, args.v12, args.v13, args.v14, args.v15, v16);
    }

    /**
     * Partially apply this function to the arguments.
     */
    default Function0<R> curry(Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> args) {
        return () -> apply(args.v1, args.v2, args.v3, args.v4, args.v5, args.v6, args.v7, args.v8, args.v9, args.v10, args.v11, args.v12, args.v13, args.v14, args.v15, args.v16);
    }
}
