package com.xiaopang.composeexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


// Intent
sealed class LoginIntent {
    object LoginClicked : LoginIntent()
    data class CredentialsEntered(val username: String, val password: String) : LoginIntent()
}

// Model
data class LoginViewState(
    val isLoading: Boolean = false,
    val isLoggedIn: Boolean = false,
    val error: String? = null
)

class LoginViewModel : ViewModel() {
    private val _state = MutableLiveData<LoginViewState>()
    val state: LiveData<LoginViewState> = _state

    fun processIntent(intent: LoginIntent) {
        when (intent) {
            is LoginIntent.LoginClicked -> loginUser()
            is LoginIntent.CredentialsEntered -> validateCredentials(intent.username, intent.password)
        }
    }

    private fun loginUser() {
        // 登录逻辑
    }

    private fun validateCredentials(username: String, password: String) {
        // 验证逻辑
    }
}

// View
class LoginActivity : AppCompatActivity() {
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        // Observe state changes
        viewModel.state.observe(this, { state ->
            render(state)
        })

        // Handle UI events
        loginButton.setOnClickListener {
            viewModel.processIntent(LoginIntent.LoginClicked)
        }

        // Handle text changes
        usernameEditText.doOnTextChanged { text, _, _, _ ->
            viewModel.processIntent(LoginIntent.CredentialsEntered(text.toString(), passwordEditText.text.toString()))
        }

        passwordEditText.doOnTextChanged { text, _, _, _ ->
            viewModel.processIntent(LoginIntent.CredentialsEntered(usernameEditText.text.toString(), text.toString()))
        }
    }

    private fun render(state: LoginViewState) {
        // 根据state更新UI
    }
}