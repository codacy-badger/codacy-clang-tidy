# readability-identifier-naming

Checks for identifiers naming style mismatch.

This check will try to enforce coding guidelines on the identifiers
naming. It supports one of the following casing types and tries to
convert from one to another if a mismatch is detected

Casing types inclde:

>   - `lower_case`,
>   - `UPPER_CASE`,
>   - `camelBack`,
>   - `CamelCase`,
>   - `camel_Snake_Back`,
>   - `Camel_Snake_Case`,
>   - `aNy_CasE`.

It also supports a fixed prefix and suffix that will be prepended or
appended to the identifiers, regardless of the casing.

Many configuration options are available, in order to be able to create
different rules for different kinds of identifiers. In general, the
rules are falling back to a more generic rule if the specific case is
not configured.

The naming of virtual methods is reported where they occur in the base
class, but not where they are overridden, as it can't be fixed locally
there. This also applies for pseudo-override patterns like CRTP.

## Options

The following options are describe below:

>   - `AbstractClassCase`, `AbstractClassPrefix`, `AbstractClassSuffix`
>   - `ClassCase`, `ClassPrefix`, `ClassSuffix`
>   - `ClassConstantCase`, `ClassConstantPrefix`, `ClassConstantSuffix`
>   - `ClassMemberCase`, `ClassMemberPrefix`, `ClassMemberSuffix`
>   - `ClassMethodCase`, `ClassMethodPrefix`, `ClassMethodSuffix`
>   - `ConstantCase`, `ConstantPrefix`, `ConstantSuffix`
>   - `ConstantMemberCase`, `ConstantMemberPrefix`,
>     `ConstantMemberSuffix`
>   - `ConstantParameterCase`, `ConstantParameterPrefix`,
>     `ConstantParameterSuffix`
>   - `ConstantPointerParameterCase`, `ConstantPointerParameterPrefix`,
>     `ConstantPointerParameterSuffix`
>   - `ConstexprFunctionCase`, `ConstexprFunctionPrefix`,
>     `ConstexprFunctionSuffix`
>   - `ConstexprMethodCase`, `ConstexprMethodPrefix`,
>     `ConstexprMethodSuffix`
>   - `ConstexprVariableCase`, `ConstexprVariablePrefix`,
>     `ConstexprVariableSuffix`
>   - `EnumCase`, `EnumPrefix`, `EnumSuffix`
>   - `EnumConstantCase`, `EnumConstantPrefix`, `EnumConstantSuffix`
>   - `FunctionCase`, `FunctionPrefix`, `FunctionSuffix`
>   - `GlobalConstantCase`, `GlobalConstantPrefix`,
>     `GlobalConstantSuffix`
>   - `GlobalConstantPointerCase`, `GlobalConstantPointerPrefix`,
>     `GlobalConstantPointerSuffix`
>   - `GlobalFunctionCase`, `GlobalFunctionPrefix`,
>     `GlobalFunctionSuffix`
>   - `GlobalPointerCase`, `GlobalPointerPrefix`, `GlobalPointerSuffix`
>   - `GlobalVariableCase`, `GlobalVariablePrefix`,
>     `GlobalVariableSuffix`
>   - `InlineNamespaceCase`, `InlineNamespacePrefix`,
>     `InlineNamespaceSuffix`
>   - `LocalConstantCase`, `LocalConstantPrefix`, `LocalConstantSuffix`
>   - `LocalConstantPointerCase`, `LocalConstantPointerPrefix`,
>     `LocalConstantPointerSuffix`
>   - `LocalPointerCase`, `LocalPointerPrefix`, `LocalPointerSuffix`
>   - `LocalVariableCase`, `LocalVariablePrefix`, `LocalVariableSuffix`
>   - `MemberCase`, `MemberPrefix`, `MemberSuffix`
>   - `MethodCase`, `MethodPrefix`, `MethodSuffix`
>   - `NamespaceCase`, `NamespacePrefix`, `NamespaceSuffix`
>   - `ParameterCase`, `ParameterPrefix`, `ParameterSuffix`
>   - `ParameterPackCase`, `ParameterPackPrefix`, `ParameterPackSuffix`
>   - `PointerParameterCase`, `PointerParameterPrefix`,
>     `PointerParameterSuffix`
>   - `PrivateMemberCase`, `PrivateMemberPrefix`, `PrivateMemberSuffix`
>   - `PrivateMethodCase`, `PrivateMethodPrefix`, `PrivateMethodSuffix`
>   - `ProtectedMemberCase`, `ProtectedMemberPrefix`,
>     `ProtectedMemberSuffix`
>   - `ProtectedMethodCase`, `ProtectedMethodPrefix`,
>     `ProtectedMethodSuffix`
>   - `PublicMemberCase`, `PublicMemberPrefix`, `PublicMemberSuffix`
>   - `PublicMethodCase`, `PublicMethodPrefix`, `PublicMethodSuffix`
>   - `StaticConstantCase`, `StaticConstantPrefix`,
>     `StaticConstantSuffix`
>   - `StaticVariableCase`, `StaticVariablePrefix`,
>     `StaticVariableSuffix`
>   - `StructCase`, `StructPrefix`, `StructSuffix`
>   - `TemplateParameterCase`, `TemplateParameterPrefix`,
>     `TemplateParameterSuffix`
>   - `TemplateTemplateParameterCase`,
>     `TemplateTemplateParameterPrefix`,
>     `TemplateTemplateParameterSuffix`
>   - `TypeAliasCase`, `TypeAliasPrefix`, `TypeAliasSuffix`
>   - `TypedefCase`, `TypedefPrefix`, `TypedefSuffix`
>   - `TypeTemplateParameterCase`, `TypeTemplateParameterPrefix`,
>     `TypeTemplateParameterSuffix`
>   - `UnionCase`, `UnionPrefix`, `UnionSuffix`
>   - `ValueTemplateParameterCase`, `ValueTemplateParameterPrefix`,
>     `ValueTemplateParameterSuffix`
>   - `VariableCase`, `VariablePrefix`, `VariableSuffix`
>   - `VirtualMethodCase`, `VirtualMethodPrefix`, `VirtualMethodSuffix`

<div class="option">

AbstractClassCase

When defined, the check will ensure abstract class names conform to the
selected casing.

</div>

<div class="option">

AbstractClassPrefix

When defined, the check will ensure abstract class names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

AbstractClassSuffix

When defined, the check will ensure abstract class names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - AbstractClassCase of `lower_case`
>   - AbstractClassPrefix of `pre_`
>   - AbstractClassSuffix of `_post`

Identifies and/or transforms abstract class names as follows:

Before:

``` c++
class ABSTRACT_CLASS {
public:
  ABSTRACT_CLASS();
};
```

After:

``` c++
class pre_abstract_class_post {
public:
  pre_abstract_class_post();
};
```

<div class="option">

ClassCase

When defined, the check will ensure class names conform to the selected
casing.

</div>

<div class="option">

ClassPrefix

When defined, the check will ensure class names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

ClassSuffix

When defined, the check will ensure class names will add the suffix with
the given value (regardless of casing).

</div>

For example using values of:

>   - ClassCase of `lower_case`
>   - ClassPrefix of `pre_`
>   - ClassSuffix of `_post`

Identifies and/or transforms class names as follows:

Before:

``` c++
class FOO {
public:
  FOO();
  ~FOO();
};
```

After:

``` c++
class pre_foo_post {
public:
  pre_foo_post();
  ~pre_foo_post();
};
```

<div class="option">

ClassConstantCase

When defined, the check will ensure class constant names conform to the
selected casing.

</div>

<div class="option">

ClassConstantPrefix

When defined, the check will ensure class constant names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ClassConstantSuffix

When defined, the check will ensure class constant names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ClassConstantCase of `lower_case`
>   - ClassConstantPrefix of `pre_`
>   - ClassConstantSuffix of `_post`

Identifies and/or transforms class constant names as follows:

Before:

``` c++
class FOO {
public:
  static const int CLASS_CONSTANT;
};
```

After:

``` c++
class FOO {
public:
  static const int pre_class_constant_post;
};
```

<div class="option">

ClassMemberCase

When defined, the check will ensure class member names conform to the
selected casing.

</div>

<div class="option">

ClassMemberPrefix

When defined, the check will ensure class member names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ClassMemberSuffix

When defined, the check will ensure class member names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ClassMemberCase of `lower_case`
>   - ClassMemberPrefix of `pre_`
>   - ClassMemberSuffix of `_post`

Identifies and/or transforms class member names as follows:

Before:

``` c++
class FOO {
public:
  static int CLASS_CONSTANT;
};
```

After:

``` c++
class FOO {
public:
  static int pre_class_constant_post;
};
```

<div class="option">

ClassMethodCase

When defined, the check will ensure class method names conform to the
selected casing.

</div>

<div class="option">

ClassMethodPrefix

When defined, the check will ensure class method names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ClassMethodSuffix

When defined, the check will ensure class method names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ClassMethodCase of `lower_case`
>   - ClassMethodPrefix of `pre_`
>   - ClassMethodSuffix of `_post`

Identifies and/or transforms class method names as follows:

Before:

``` c++
class FOO {
public:
  int CLASS_MEMBER();
};
```

After:

``` c++
class FOO {
public:
  int pre_class_member_post();
};
```

<div class="option">

ConstantCase

When defined, the check will ensure constant names conform to the
selected casing.

</div>

<div class="option">

ConstantPrefix

When defined, the check will ensure constant names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

ConstantSuffix

When defined, the check will ensure constant names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - ConstantCase of `lower_case`
>   - ConstantPrefix of `pre_`
>   - ConstantSuffix of `_post`

Identifies and/or transforms constant names as follows:

Before:

``` c++
void function() { unsigned const MyConst_array[] = {1, 2, 3}; }
```

After:

``` c++
void function() { unsigned const pre_myconst_array_post[] = {1, 2, 3}; }
```

<div class="option">

ConstantMemberCase

When defined, the check will ensure constant member names conform to the
selected casing.

</div>

<div class="option">

ConstantMemberPrefix

When defined, the check will ensure constant member names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ConstantMemberSuffix

When defined, the check will ensure constant member names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ConstantMemberCase of `lower_case`
>   - ConstantMemberPrefix of `pre_`
>   - ConstantMemberSuffix of `_post`

Identifies and/or transforms constant member names as follows:

Before:

``` c++
class Foo {
  char const MY_ConstMember_string[4] = "123";
}
```

After:

``` c++
class Foo {
  char const pre_my_constmember_string_post[4] = "123";
}
```

<div class="option">

ConstantParameterCase

When defined, the check will ensure constant parameter names conform to
the selected casing.

</div>

<div class="option">

ConstantParameterPrefix

When defined, the check will ensure constant parameter names will add
the prefixed with the given value (regardless of casing).

</div>

<div class="option">

ConstantParameterSuffix

When defined, the check will ensure constant parameter names will add
the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ConstantParameterCase of `lower_case`
>   - ConstantParameterPrefix of `pre_`
>   - ConstantParameterSuffix of `_post`

Identifies and/or transforms constant parameter names as follows:

Before:

``` c++
void GLOBAL_FUNCTION(int PARAMETER_1, int const CONST_parameter);
```

After:

``` c++
void GLOBAL_FUNCTION(int PARAMETER_1, int const pre_const_parameter_post);
```

<div class="option">

ConstantPointerParameterCase

When defined, the check will ensure constant pointer parameter names
conform to the selected casing.

</div>

<div class="option">

ConstantPointerParameterPrefix

When defined, the check will ensure constant pointer parameter names
will add the prefixed with the given value (regardless of casing).

</div>

<div class="option">

ConstantPointerParameterSuffix

When defined, the check will ensure constant pointer parameter names
will add the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ConstantPointerParameterCase of `lower_case`
>   - ConstantPointerParameterPrefix of `pre_`
>   - ConstantPointerParameterSuffix of `_post`

Identifies and/or transforms constant pointer parameter names as
follows:

Before:

``` c++
void GLOBAL_FUNCTION(int const *CONST_parameter);
```

After:

``` c++
void GLOBAL_FUNCTION(int const *pre_const_parameter_post);
```

<div class="option">

ConstexprFunctionCase

When defined, the check will ensure constexpr function names conform to
the selected casing.

</div>

<div class="option">

ConstexprFunctionPrefix

When defined, the check will ensure constexpr function names will add
the prefixed with the given value (regardless of casing).

</div>

<div class="option">

ConstexprFunctionSuffix

When defined, the check will ensure constexpr function names will add
the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ConstexprFunctionCase of `lower_case`
>   - ConstexprFunctionPrefix of `pre_`
>   - ConstexprFunctionSuffix of `_post`

Identifies and/or transforms constexpr function names as follows:

Before:

``` c++
constexpr int CE_function() { return 3; }
```

After:

``` c++
constexpr int pre_ce_function_post() { return 3; }
```

<div class="option">

ConstexprMethodCase

When defined, the check will ensure constexpr method names conform to
the selected casing.

</div>

<div class="option">

ConstexprMethodPrefix

When defined, the check will ensure constexpr method names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ConstexprMethodSuffix

When defined, the check will ensure constexpr method names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ConstexprMethodCase of `lower_case`
>   - ConstexprMethodPrefix of `pre_`
>   - ConstexprMethodSuffix of `_post`

Identifies and/or transforms constexpr method names as follows:

Before:

``` c++
class Foo {
public:
  constexpr int CST_expr_Method() { return 2; }
}
```

After:

``` c++
class Foo {
public:
  constexpr int pre_cst_expr_method_post() { return 2; }
}
```

<div class="option">

ConstexprVariableCase

When defined, the check will ensure constexpr variable names conform to
the selected casing.

</div>

<div class="option">

ConstexprVariablePrefix

When defined, the check will ensure constexpr variable names will add
the prefixed with the given value (regardless of casing).

</div>

<div class="option">

ConstexprVariableSuffix

When defined, the check will ensure constexpr variable names will add
the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ConstexprVariableCase of `lower_case`
>   - ConstexprVariablePrefix of `pre_`
>   - ConstexprVariableSuffix of `_post`

Identifies and/or transforms constexpr variable names as follows:

Before:

``` c++
constexpr int ConstExpr_variable = MyConstant;
```

After:

``` c++
constexpr int pre_constexpr_variable_post = MyConstant;
```

<div class="option">

EnumCase

When defined, the check will ensure enumeration names conform to the
selected casing.

</div>

<div class="option">

EnumPrefix

When defined, the check will ensure enumeration names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

EnumSuffix

When defined, the check will ensure enumeration names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - EnumCase of `lower_case`
>   - EnumPrefix of `pre_`
>   - EnumSuffix of `_post`

Identifies and/or transforms enumeration names as follows:

Before:

``` c++
enum FOO { One, Two, Three };
```

After:

``` c++
enum pre_foo_post { One, Two, Three };
```

<div class="option">

EnumConstantCase

When defined, the check will ensure enumeration constant names conform
to the selected casing.

</div>

<div class="option">

EnumConstantPrefix

When defined, the check will ensure enumeration constant names will add
the prefixed with the given value (regardless of casing).

</div>

<div class="option">

EnumConstantSuffix

When defined, the check will ensure enumeration constant names will add
the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - EnumConstantCase of `lower_case`
>   - EnumConstantPrefix of `pre_`
>   - EnumConstantSuffix of `_post`

Identifies and/or transforms enumeration constant names as follows:

Before:

``` c++
enum FOO { One, Two, Three };
```

After:

``` c++
enum FOO { pre_One_post, pre_Two_post, pre_Three_post };
```

<div class="option">

FunctionCase

When defined, the check will ensure function names conform to the
selected casing.

</div>

<div class="option">

FunctionPrefix

When defined, the check will ensure function names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

FunctionSuffix

When defined, the check will ensure function names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - FunctionCase of `lower_case`
>   - FunctionPrefix of `pre_`
>   - FunctionSuffix of `_post`

Identifies and/or transforms function names as follows:

Before:

``` c++
char MY_Function_string();
```

After:

``` c++
char pre_my_function_string_post();
```

<div class="option">

GlobalConstantCase

When defined, the check will ensure global constant names conform to the
selected casing.

</div>

<div class="option">

GlobalConstantPrefix

When defined, the check will ensure global constant names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

GlobalConstantSuffix

When defined, the check will ensure global constant names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - GlobalConstantCase of `lower_case`
>   - GlobalConstantPrefix of `pre_`
>   - GlobalConstantSuffix of `_post`

Identifies and/or transforms global constant names as follows:

Before:

``` c++
unsigned const MyConstGlobal_array[] = {1, 2, 3};
```

After:

``` c++
unsigned const pre_myconstglobal_array_post[] = {1, 2, 3};
```

<div class="option">

GlobalConstantPointerCase

When defined, the check will ensure global constant pointer names
conform to the selected casing.

</div>

<div class="option">

GlobalConstantPointerPrefix

When defined, the check will ensure global constant pointer names will
add the prefixed with the given value (regardless of casing).

</div>

<div class="option">

GlobalConstantPointerSuffix

When defined, the check will ensure global constant pointer names will
add the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - GlobalConstantPointerCase of `lower_case`
>   - GlobalConstantPointerPrefix of `pre_`
>   - GlobalConstantPointerSuffix of `_post`

Identifies and/or transforms global constant pointer names as follows:

Before:

``` c++
int *const MyConstantGlobalPointer = nullptr;
```

After:

``` c++
int *const pre_myconstantglobalpointer_post = nullptr;
```

<div class="option">

GlobalFunctionCase

When defined, the check will ensure global function names conform to the
selected casing.

</div>

<div class="option">

GlobalFunctionPrefix

When defined, the check will ensure global function names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

GlobalFunctionSuffix

When defined, the check will ensure global function names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - GlobalFunctionCase of `lower_case`
>   - GlobalFunctionPrefix of `pre_`
>   - GlobalFunctionSuffix of `_post`

Identifies and/or transforms global function names as follows:

Before:

``` c++
void GLOBAL_FUNCTION(int PARAMETER_1, int const CONST_parameter);
```

After:

``` c++
void pre_global_function_post(int PARAMETER_1, int const CONST_parameter);
```

<div class="option">

GlobalPointerCase

When defined, the check will ensure global pointer names conform to the
selected casing.

</div>

<div class="option">

GlobalPointerPrefix

When defined, the check will ensure global pointer names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

GlobalPointerSuffix

When defined, the check will ensure global pointer names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - GlobalPointerCase of `lower_case`
>   - GlobalPointerPrefix of `pre_`
>   - GlobalPointerSuffix of `_post`

Identifies and/or transforms global pointer names as follows:

Before:

``` c++
int *GLOBAL3;
```

After:

``` c++
int *pre_global3_post;
```

<div class="option">

GlobalVariableCase

When defined, the check will ensure global variable names conform to the
selected casing.

</div>

<div class="option">

GlobalVariablePrefix

When defined, the check will ensure global variable names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

GlobalVariableSuffix

When defined, the check will ensure global variable names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - GlobalVariableCase of `lower_case`
>   - GlobalVariablePrefix of `pre_`
>   - GlobalVariableSuffix of `_post`

Identifies and/or transforms global variable names as follows:

Before:

``` c++
int GLOBAL3;
```

After:

``` c++
int pre_global3_post;
```

<div class="option">

InlineNamespaceCase

When defined, the check will ensure inline namespaces names conform to
the selected casing.

</div>

<div class="option">

InlineNamespacePrefix

When defined, the check will ensure inline namespaces names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

InlineNamespaceSuffix

When defined, the check will ensure inline namespaces names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - InlineNamespaceCase of `lower_case`
>   - InlineNamespacePrefix of `pre_`
>   - InlineNamespaceSuffix of `_post`

Identifies and/or transforms inline namespaces names as follows:

Before:

``` c++
namespace FOO_NS {
inline namespace InlineNamespace {
...
}
} // namespace FOO_NS
```

After:

``` c++
namespace FOO_NS {
inline namespace pre_inlinenamespace_post {
...
}
} // namespace FOO_NS
```

<div class="option">

LocalConstantCase

When defined, the check will ensure local constant names conform to the
selected casing.

</div>

<div class="option">

LocalConstantPrefix

When defined, the check will ensure local constant names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

LocalConstantSuffix

When defined, the check will ensure local constant names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - LocalConstantCase of `lower_case`
>   - LocalConstantPrefix of `pre_`
>   - LocalConstantSuffix of `_post`

Identifies and/or transforms local constant names as follows:

Before:

``` c++
void foo() { int const local_Constant = 3; }
```

After:

``` c++
void foo() { int const pre_local_constant_post = 3; }
```

<div class="option">

LocalConstantPointerCase

When defined, the check will ensure local constant pointer names conform
to the selected casing.

</div>

<div class="option">

LocalConstantPointerPrefix

When defined, the check will ensure local constant pointer names will
add the prefixed with the given value (regardless of casing).

</div>

<div class="option">

LocalConstantPointerSuffix

When defined, the check will ensure local constant pointer names will
add the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - LocalConstantPointerCase of `lower_case`
>   - LocalConstantPointerPrefix of `pre_`
>   - LocalConstantPointerSuffix of `_post`

Identifies and/or transforms local constant pointer names as follows:

Before:

``` c++
void foo() { int const *local_Constant = 3; }
```

After:

``` c++
void foo() { int const *pre_local_constant_post = 3; }
```

<div class="option">

LocalPointerCase

When defined, the check will ensure local pointer names conform to the
selected casing.

</div>

<div class="option">

LocalPointerPrefix

When defined, the check will ensure local pointer names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

LocalPointerSuffix

When defined, the check will ensure local pointer names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - LocalPointerCase of `lower_case`
>   - LocalPointerPrefix of `pre_`
>   - LocalPointerSuffix of `_post`

Identifies and/or transforms local pointer names as follows:

Before:

``` c++
void foo() { int *local_Constant; }
```

After:

``` c++
void foo() { int *pre_local_constant_post; }
```

<div class="option">

LocalVariableCase

When defined, the check will ensure local variable names conform to the
selected casing.

</div>

<div class="option">

LocalVariablePrefix

When defined, the check will ensure local variable names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

LocalVariableSuffix

When defined, the check will ensure local variable names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - LocalVariableCase of `lower_case`
>   - LocalVariablePrefix of `pre_`
>   - LocalVariableSuffix of `_post`

Identifies and/or transforms local variable names as follows:

Before:

``` c++
void foo() { int local_Constant; }
```

After:

``` c++
void foo() { int pre_local_constant_post; }
```

<div class="option">

MemberCase

When defined, the check will ensure member names conform to the selected
casing.

</div>

<div class="option">

MemberPrefix

When defined, the check will ensure member names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

MemberSuffix

When defined, the check will ensure member names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - MemberCase of `lower_case`
>   - MemberPrefix of `pre_`
>   - MemberSuffix of `_post`

Identifies and/or transforms member names as follows:

Before:

``` c++
class Foo {
  char MY_ConstMember_string[4];
}
```

After:

``` c++
class Foo {
  char pre_my_constmember_string_post[4];
}
```

<div class="option">

MethodCase

When defined, the check will ensure method names conform to the selected
casing.

</div>

<div class="option">

MethodPrefix

When defined, the check will ensure method names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

MethodSuffix

When defined, the check will ensure method names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - MethodCase of `lower_case`
>   - MethodPrefix of `pre_`
>   - MethodSuffix of `_post`

Identifies and/or transforms method names as follows:

Before:

``` c++
class Foo {
  char MY_Method_string();
}
```

After:

``` c++
class Foo {
  char pre_my_method_string_post();
}
```

<div class="option">

NamespaceCase

When defined, the check will ensure namespace names conform to the
selected casing.

</div>

<div class="option">

NamespacePrefix

When defined, the check will ensure namespace names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

NamespaceSuffix

When defined, the check will ensure namespace names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - NamespaceCase of `lower_case`
>   - NamespacePrefix of `pre_`
>   - NamespaceSuffix of `_post`

Identifies and/or transforms namespace names as follows:

Before:

``` c++
namespace FOO_NS {
...
}
```

After:

``` c++
namespace pre_foo_ns_post {
...
}
```

<div class="option">

ParameterCase

When defined, the check will ensure parameter names conform to the
selected casing.

</div>

<div class="option">

ParameterPrefix

When defined, the check will ensure parameter names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ParameterSuffix

When defined, the check will ensure parameter names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - ParameterCase of `lower_case`
>   - ParameterPrefix of `pre_`
>   - ParameterSuffix of `_post`

Identifies and/or transforms parameter names as follows:

Before:

``` c++
void GLOBAL_FUNCTION(int PARAMETER_1, int const CONST_parameter);
```

After:

``` c++
void GLOBAL_FUNCTION(int pre_parameter_post, int const CONST_parameter);
```

<div class="option">

ParameterPackCase

When defined, the check will ensure parameter pack names conform to the
selected casing.

</div>

<div class="option">

ParameterPackPrefix

When defined, the check will ensure parameter pack names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ParameterPackSuffix

When defined, the check will ensure parameter pack names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ParameterPackCase of `lower_case`
>   - ParameterPackPrefix of `pre_`
>   - ParameterPackSuffix of `_post`

Identifies and/or transforms parameter pack names as follows:

Before:

``` c++
template <typename... TYPE_parameters> {
  void FUNCTION(int... TYPE_parameters);
}
```

After:

``` c++
template <typename... TYPE_parameters> {
  void FUNCTION(int... pre_type_parameters_post);
}
```

<div class="option">

PointerParameterCase

When defined, the check will ensure pointer parameter names conform to
the selected casing.

</div>

<div class="option">

PointerParameterPrefix

When defined, the check will ensure pointer parameter names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

PointerParameterSuffix

When defined, the check will ensure pointer parameter names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - PointerParameterCase of `lower_case`
>   - PointerParameterPrefix of `pre_`
>   - PointerParameterSuffix of `_post`

Identifies and/or transforms pointer parameter names as follows:

Before:

``` c++
void FUNCTION(int *PARAMETER);
```

After:

``` c++
void FUNCTION(int *pre_parameter_post);
```

<div class="option">

PrivateMemberCase

When defined, the check will ensure private member names conform to the
selected casing.

</div>

<div class="option">

PrivateMemberPrefix

When defined, the check will ensure private member names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

PrivateMemberSuffix

When defined, the check will ensure private member names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - PrivateMemberCase of `lower_case`
>   - PrivateMemberPrefix of `pre_`
>   - PrivateMemberSuffix of `_post`

Identifies and/or transforms private member names as follows:

Before:

``` c++
class Foo {
private:
  int Member_Variable;
}
```

After:

``` c++
class Foo {
private:
  int pre_member_variable_post;
}
```

<div class="option">

PrivateMethodCase

When defined, the check will ensure private method names conform to the
selected casing.

</div>

<div class="option">

PrivateMethodPrefix

When defined, the check will ensure private method names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

PrivateMethodSuffix

When defined, the check will ensure private method names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - PrivateMethodCase of `lower_case`
>   - PrivateMethodPrefix of `pre_`
>   - PrivateMethodSuffix of `_post`

Identifies and/or transforms private method names as follows:

Before:

``` c++
class Foo {
private:
  int Member_Method();
}
```

After:

``` c++
class Foo {
private:
  int pre_member_method_post();
}
```

<div class="option">

ProtectedMemberCase

When defined, the check will ensure protected member names conform to
the selected casing.

</div>

<div class="option">

ProtectedMemberPrefix

When defined, the check will ensure protected member names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ProtectedMemberSuffix

When defined, the check will ensure protected member names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ProtectedMemberCase of `lower_case`
>   - ProtectedMemberPrefix of `pre_`
>   - ProtectedMemberSuffix of `_post`

Identifies and/or transforms protected member names as follows:

Before:

``` c++
class Foo {
protected:
  int Member_Variable;
}
```

After:

``` c++
class Foo {
protected:
  int pre_member_variable_post;
}
```

<div class="option">

ProtectedMethodCase

When defined, the check will ensure protect method names conform to the
selected casing.

</div>

<div class="option">

ProtectedMethodPrefix

When defined, the check will ensure protect method names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

ProtectedMethodSuffix

When defined, the check will ensure protect method names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ProtectedMethodCase of `lower_case`
>   - ProtectedMethodPrefix of `pre_`
>   - ProtectedMethodSuffix of `_post`

Identifies and/or transforms protect method names as follows:

Before:

``` c++
class Foo {
protected:
  int Member_Method();
}
```

After:

``` c++
class Foo {
protected:
  int pre_member_method_post();
}
```

<div class="option">

PublicMemberCase

When defined, the check will ensure public member names conform to the
selected casing.

</div>

<div class="option">

PublicMemberPrefix

When defined, the check will ensure public member names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

PublicMemberSuffix

When defined, the check will ensure public member names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - PublicMemberCase of `lower_case`
>   - PublicMemberPrefix of `pre_`
>   - PublicMemberSuffix of `_post`

Identifies and/or transforms public member names as follows:

Before:

``` c++
class Foo {
public:
  int Member_Variable;
}
```

After:

``` c++
class Foo {
public:
  int pre_member_variable_post;
}
```

<div class="option">

PublicMethodCase

When defined, the check will ensure public method names conform to the
selected casing.

</div>

<div class="option">

PublicMethodPrefix

When defined, the check will ensure public method names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

PublicMethodSuffix

When defined, the check will ensure public method names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - PublicMethodCase of `lower_case`
>   - PublicMethodPrefix of `pre_`
>   - PublicMethodSuffix of `_post`

Identifies and/or transforms public method names as follows:

Before:

``` c++
class Foo {
public:
  int Member_Method();
}
```

After:

``` c++
class Foo {
public:
  int pre_member_method_post();
}
```

<div class="option">

StaticConstantCase

When defined, the check will ensure static constant names conform to the
selected casing.

</div>

<div class="option">

StaticConstantPrefix

When defined, the check will ensure static constant names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

StaticConstantSuffix

When defined, the check will ensure static constant names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - StaticConstantCase of `lower_case`
>   - StaticConstantPrefix of `pre_`
>   - StaticConstantSuffix of `_post`

Identifies and/or transforms static constant names as follows:

Before:

``` c++
static unsigned const MyConstStatic_array[] = {1, 2, 3};
```

After:

``` c++
static unsigned const pre_myconststatic_array_post[] = {1, 2, 3};
```

<div class="option">

StaticVariableCase

When defined, the check will ensure static variable names conform to the
selected casing.

</div>

<div class="option">

StaticVariablePrefix

When defined, the check will ensure static variable names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

StaticVariableSuffix

When defined, the check will ensure static variable names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - StaticVariableCase of `lower_case`
>   - StaticVariablePrefix of `pre_`
>   - StaticVariableSuffix of `_post`

Identifies and/or transforms static variable names as follows:

Before:

``` c++
static unsigned MyStatic_array[] = {1, 2, 3};
```

After:

``` c++
static unsigned pre_mystatic_array_post[] = {1, 2, 3};
```

<div class="option">

StructCase

When defined, the check will ensure struct names conform to the selected
casing.

</div>

<div class="option">

StructPrefix

When defined, the check will ensure struct names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

StructSuffix

When defined, the check will ensure struct names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - StructCase of `lower_case`
>   - StructPrefix of `pre_`
>   - StructSuffix of `_post`

Identifies and/or transforms struct names as follows:

Before:

``` c++
struct FOO {
  FOO();
  ~FOO();
};
```

After:

``` c++
struct pre_foo_post {
  pre_foo_post();
  ~pre_foo_post();
};
```

<div class="option">

TemplateParameterCase

When defined, the check will ensure template parameter names conform to
the selected casing.

</div>

<div class="option">

TemplateParameterPrefix

When defined, the check will ensure template parameter names will add
the prefixed with the given value (regardless of casing).

</div>

<div class="option">

TemplateParameterSuffix

When defined, the check will ensure template parameter names will add
the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - TemplateParameterCase of `lower_case`
>   - TemplateParameterPrefix of `pre_`
>   - TemplateParameterSuffix of `_post`

Identifies and/or transforms template parameter names as follows:

Before:

``` c++
template <typename T> class Foo {};
```

After:

``` c++
template <typename pre_t_post> class Foo {};
```

<div class="option">

TemplateTemplateParameterCase

When defined, the check will ensure template template parameter names
conform to the selected casing.

</div>

<div class="option">

TemplateTemplateParameterPrefix

When defined, the check will ensure template template parameter names
will add the prefixed with the given value (regardless of casing).

</div>

<div class="option">

TemplateTemplateParameterSuffix

When defined, the check will ensure template template parameter names
will add the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - TemplateTemplateParameterCase of `lower_case`
>   - TemplateTemplateParameterPrefix of `pre_`
>   - TemplateTemplateParameterSuffix of `_post`

Identifies and/or transforms template template parameter names as
follows:

Before:

``` c++
template <template <typename> class TPL_parameter, int COUNT_params,
          typename... TYPE_parameters>
```

After:

``` c++
template <template <typename> class pre_tpl_parameter_post, int COUNT_params,
          typename... TYPE_parameters>
```

<div class="option">

TypeAliasCase

When defined, the check will ensure type alias names conform to the
selected casing.

</div>

<div class="option">

TypeAliasPrefix

When defined, the check will ensure type alias names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

TypeAliasSuffix

When defined, the check will ensure type alias names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - TypeAliasCase of `lower_case`
>   - TypeAliasPrefix of `pre_`
>   - TypeAliasSuffix of `_post`

Identifies and/or transforms type alias names as follows:

Before:

``` c++
using MY_STRUCT_TYPE = my_structure;
```

After:

``` c++
using pre_my_struct_type_post = my_structure;
```

<div class="option">

TypedefCase

When defined, the check will ensure typedef names conform to the
selected casing.

</div>

<div class="option">

TypedefPrefix

When defined, the check will ensure typedef names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

TypedefSuffix

When defined, the check will ensure typedef names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - TypedefCase of `lower_case`
>   - TypedefPrefix of `pre_`
>   - TypedefSuffix of `_post`

Identifies and/or transforms typedef names as follows:

Before:

``` c++
typedef int MYINT;
```

After:

``` c++
typedef int pre_myint_post;
```

<div class="option">

TypeTemplateParameterCase

When defined, the check will ensure type template parameter names
conform to the selected casing.

</div>

<div class="option">

TypeTemplateParameterPrefix

When defined, the check will ensure type template parameter names will
add the prefixed with the given value (regardless of casing).

</div>

<div class="option">

TypeTemplateParameterSuffix

When defined, the check will ensure type template parameter names will
add the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - TypeTemplateParameterCase of `lower_case`
>   - TypeTemplateParameterPrefix of `pre_`
>   - TypeTemplateParameterSuffix of `_post`

Identifies and/or transforms type template parameter names as follows:

Before:

``` c++
template <template <typename> class TPL_parameter, int COUNT_params,
          typename... TYPE_parameters>
```

After:

``` c++
template <template <typename> class TPL_parameter, int COUNT_params,
          typename... pre_type_parameters_post>
```

<div class="option">

UnionCase

When defined, the check will ensure union names conform to the selected
casing.

</div>

<div class="option">

UnionPrefix

When defined, the check will ensure union names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

UnionSuffix

When defined, the check will ensure union names will add the suffix with
the given value (regardless of casing).

</div>

For example using values of:

>   - UnionCase of `lower_case`
>   - UnionPrefix of `pre_`
>   - UnionSuffix of `_post`

Identifies and/or transforms union names as follows:

Before:

``` c++
union FOO {
  int a;
  char b;
};
```

After:

``` c++
union pre_foo_post {
  int a;
  char b;
};
```

<div class="option">

ValueTemplateParameterCase

When defined, the check will ensure value template parameter names
conform to the selected casing.

</div>

<div class="option">

ValueTemplateParameterPrefix

When defined, the check will ensure value template parameter names will
add the prefixed with the given value (regardless of casing).

</div>

<div class="option">

ValueTemplateParameterSuffix

When defined, the check will ensure value template parameter names will
add the suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - ValueTemplateParameterCase of `lower_case`
>   - ValueTemplateParameterPrefix of `pre_`
>   - ValueTemplateParameterSuffix of `_post`

Identifies and/or transforms value template parameter names as follows:

Before:

``` c++
template <template <typename> class TPL_parameter, int COUNT_params,
          typename... TYPE_parameters>
```

After:

``` c++
template <template <typename> class TPL_parameter, int pre_count_params_post,
          typename... TYPE_parameters>
```

<div class="option">

VariableCase

When defined, the check will ensure variable names conform to the
selected casing.

</div>

<div class="option">

VariablePrefix

When defined, the check will ensure variable names will add the prefixed
with the given value (regardless of casing).

</div>

<div class="option">

VariableSuffix

When defined, the check will ensure variable names will add the suffix
with the given value (regardless of casing).

</div>

For example using values of:

>   - VariableCase of `lower_case`
>   - VariablePrefix of `pre_`
>   - VariableSuffix of `_post`

Identifies and/or transforms variable names as follows:

Before:

``` c++
unsigned MyVariable;
```

After:

``` c++
unsigned pre_myvariable_post;
```

<div class="option">

VirtualMethodCase

When defined, the check will ensure virtual method names conform to the
selected casing.

</div>

<div class="option">

VirtualMethodPrefix

When defined, the check will ensure virtual method names will add the
prefixed with the given value (regardless of casing).

</div>

<div class="option">

VirtualMethodSuffix

When defined, the check will ensure virtual method names will add the
suffix with the given value (regardless of casing).

</div>

For example using values of:

>   - VirtualMethodCase of `lower_case`
>   - VirtualMethodPrefix of `pre_`
>   - VirtualMethodSuffix of `_post`

Identifies and/or transforms virtual method names as follows:

Before:

``` c++
class Foo {
public:
  virtual int MemberFunction();
}
```

After:

``` c++
class Foo {
public:
  virtual int pre_member_function_post();
}
```
