/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.jetbrains.jet.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptor;
import org.jetbrains.jet.lang.BuiltinsScopeExtensionMode;
import org.jetbrains.jet.lang.resolve.java.JavaBridgeConfiguration;
import org.jetbrains.jet.lang.resolve.java.JavaSemanticServices;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.PsiClassFinderImpl;
import org.jetbrains.jet.lang.resolve.java.JavaTypeTransformer;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaCompileTimeConstResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassObjectResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaNamespaceResolver;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorSignatureResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaConstructorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaValueParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaFunctionResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaInnerClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaPropertiesResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.di.AllInjectorsGenerator. DO NOT EDIT! */
public class InjectorForJavaDescriptorResolver {

    private final Project project;
    private final BindingTrace bindingTrace;
    private final ModuleDescriptor moduleDescriptor;
    private final BuiltinsScopeExtensionMode builtinsScopeExtensionMode;
    private JavaBridgeConfiguration javaBridgeConfiguration;
    private JavaSemanticServices javaSemanticServices;
    private JavaDescriptorResolver javaDescriptorResolver;
    private PsiClassFinderImpl psiClassFinder;
    private JavaTypeTransformer javaTypeTransformer;
    private JavaClassResolver javaClassResolver;
    private JavaAnnotationResolver javaAnnotationResolver;
    private JavaCompileTimeConstResolver javaCompileTimeConstResolver;
    private JavaClassObjectResolver javaClassObjectResolver;
    private JavaNamespaceResolver javaNamespaceResolver;
    private JavaDescriptorSignatureResolver javaDescriptorSignatureResolver;
    private JavaConstructorResolver javaConstructorResolver;
    private JavaValueParameterResolver javaValueParameterResolver;
    private JavaFunctionResolver javaFunctionResolver;
    private JavaInnerClassResolver javaInnerClassResolver;
    private JavaPropertiesResolver javaPropertiesResolver;

    public InjectorForJavaDescriptorResolver(
        @NotNull Project project,
        @NotNull BindingTrace bindingTrace,
        @NotNull ModuleDescriptor moduleDescriptor,
        @NotNull BuiltinsScopeExtensionMode builtinsScopeExtensionMode
    ) {
        this.project = project;
        this.bindingTrace = bindingTrace;
        this.moduleDescriptor = moduleDescriptor;
        this.builtinsScopeExtensionMode = builtinsScopeExtensionMode;
        this.javaBridgeConfiguration = new JavaBridgeConfiguration();
        this.javaSemanticServices = new JavaSemanticServices();
        this.javaDescriptorResolver = new JavaDescriptorResolver();
        this.psiClassFinder = new PsiClassFinderImpl();
        this.javaTypeTransformer = new JavaTypeTransformer();
        this.javaClassResolver = new JavaClassResolver();
        this.javaAnnotationResolver = new JavaAnnotationResolver();
        this.javaCompileTimeConstResolver = new JavaCompileTimeConstResolver();
        this.javaClassObjectResolver = new JavaClassObjectResolver();
        this.javaNamespaceResolver = new JavaNamespaceResolver();
        this.javaDescriptorSignatureResolver = new JavaDescriptorSignatureResolver();
        this.javaConstructorResolver = new JavaConstructorResolver();
        this.javaValueParameterResolver = new JavaValueParameterResolver();
        this.javaFunctionResolver = new JavaFunctionResolver();
        this.javaInnerClassResolver = new JavaInnerClassResolver();
        this.javaPropertiesResolver = new JavaPropertiesResolver();

        javaBridgeConfiguration.setBuiltinsScopeExtensionMode(builtinsScopeExtensionMode);
        javaBridgeConfiguration.setJavaSemanticServices(javaSemanticServices);
        javaBridgeConfiguration.setProject(project);

        this.javaSemanticServices.setDescriptorResolver(javaDescriptorResolver);
        this.javaSemanticServices.setPsiClassFinder(psiClassFinder);
        this.javaSemanticServices.setTrace(bindingTrace);
        this.javaSemanticServices.setTypeTransformer(javaTypeTransformer);

        this.javaDescriptorResolver.setClassResolver(javaClassResolver);
        this.javaDescriptorResolver.setConstructorResolver(javaConstructorResolver);
        this.javaDescriptorResolver.setFunctionResolver(javaFunctionResolver);
        this.javaDescriptorResolver.setInnerClassResolver(javaInnerClassResolver);
        this.javaDescriptorResolver.setNamespaceResolver(javaNamespaceResolver);
        this.javaDescriptorResolver.setPropertiesResolver(javaPropertiesResolver);

        this.psiClassFinder.setProject(project);

        javaTypeTransformer.setJavaSemanticServices(javaSemanticServices);
        javaTypeTransformer.setResolver(javaDescriptorResolver);

        javaClassResolver.setAnnotationResolver(javaAnnotationResolver);
        javaClassResolver.setClassObjectResolver(javaClassObjectResolver);
        javaClassResolver.setJavaDescriptorResolver(javaDescriptorResolver);
        javaClassResolver.setNamespaceResolver(javaNamespaceResolver);
        javaClassResolver.setPsiClassFinder(psiClassFinder);
        javaClassResolver.setSemanticServices(javaSemanticServices);
        javaClassResolver.setSignatureResolver(javaDescriptorSignatureResolver);
        javaClassResolver.setTrace(bindingTrace);
        javaClassResolver.setTypeTransformer(javaTypeTransformer);

        javaAnnotationResolver.setClassResolver(javaClassResolver);
        javaAnnotationResolver.setCompileTimeConstResolver(javaCompileTimeConstResolver);

        javaCompileTimeConstResolver.setAnnotationResolver(javaAnnotationResolver);
        javaCompileTimeConstResolver.setClassResolver(javaClassResolver);

        javaClassObjectResolver.setClassResolver(javaClassResolver);
        javaClassObjectResolver.setJavaDescriptorResolver(javaDescriptorResolver);
        javaClassObjectResolver.setSemanticServices(javaSemanticServices);
        javaClassObjectResolver.setTrace(bindingTrace);

        javaNamespaceResolver.setJavaSemanticServices(javaSemanticServices);
        javaNamespaceResolver.setPsiClassFinder(psiClassFinder);
        javaNamespaceResolver.setTrace(bindingTrace);

        javaDescriptorSignatureResolver.setJavaSemanticServices(javaSemanticServices);

        javaConstructorResolver.setTrace(bindingTrace);
        javaConstructorResolver.setTypeTransformer(javaTypeTransformer);
        javaConstructorResolver.setValueParameterResolver(javaValueParameterResolver);

        javaValueParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaFunctionResolver.setAnnotationResolver(javaAnnotationResolver);
        javaFunctionResolver.setParameterResolver(javaValueParameterResolver);
        javaFunctionResolver.setSignatureResolver(javaDescriptorSignatureResolver);
        javaFunctionResolver.setTrace(bindingTrace);
        javaFunctionResolver.setTypeTransformer(javaTypeTransformer);

        javaInnerClassResolver.setClassResolver(javaClassResolver);

        javaPropertiesResolver.setAnnotationResolver(javaAnnotationResolver);
        javaPropertiesResolver.setClassResolver(javaClassResolver);
        javaPropertiesResolver.setJavaDescriptorSignatureResolver(javaDescriptorSignatureResolver);
        javaPropertiesResolver.setSemanticServices(javaSemanticServices);
        javaPropertiesResolver.setTrace(bindingTrace);

        javaBridgeConfiguration.init();

        psiClassFinder.initialize();

    }

    @PreDestroy
    public void destroy() {
    }

    public Project getProject() {
        return this.project;
    }

    public BindingTrace getBindingTrace() {
        return this.bindingTrace;
    }

    public ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public JavaSemanticServices getJavaSemanticServices() {
        return this.javaSemanticServices;
    }

    public JavaDescriptorResolver getJavaDescriptorResolver() {
        return this.javaDescriptorResolver;
    }

    public PsiClassFinderImpl getPsiClassFinder() {
        return this.psiClassFinder;
    }

}
